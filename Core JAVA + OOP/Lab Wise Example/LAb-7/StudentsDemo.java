import java.util.Scanner;
class Student{
    int idNo;
    int noOfSubjects;
    String[] subCode;
    int[] credit;
    String[] grade;
    double spi;
    double total;
    double totalCredit;
    int gradeValue;
    public Student(int idNo,int noOfSubjects,String[] subCode,int[] credit,String[] grade){
        this.idNo = idNo;
        this.noOfSubjects = noOfSubjects;
        this.subCode = subCode;
        this.credit = credit;
        this.grade = grade;
    }
    public double spiCal(){
        for(int i = 0 ; i < this.noOfSubjects ; i++){0
            this.gradeValue = gradeValue(grade[i]);
            this.total += this.gradeValue * this.credit[i];
            this.totalCredit += this.credit[i];
        }
        return (total/totalCredit);
    }
    
    public int gradeValue(String grade){
        switch(grade){
            case "A": return 8;
            case "B": return 7;
            case "C": return 6;
            case "D": return 5;
            case "E": return 4;
            case "F": return 3;
            case "O": return 9;
            case "O+": return 10;
        }
        return 0;
    }
}
public class StudentsDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfStudents = Integer.parseInt(args[0]);
        System.out.println(noOfStudents);
        Student[] s = new Student[noOfStudents];

        for(int i = 0 ; i < noOfStudents ; i++){
            System.out.println("Enter student id : ");
            int idNo = sc.nextInt();
            System.out.println("Enter no of subjects regitered : ");
            int noOfSubjects = sc.nextInt();
            String[] subCode = new String[noOfSubjects];
            int[] credit = new int[noOfSubjects];
            String[] grade = new String[noOfSubjects];
            sc.nextLine();
            for(int j = 0; j < noOfSubjects ; j++){
                System.out.println("Enter subject code for subject no."+(j+1)+" : ");
                subCode[j] = sc.nextLine();
                System.out.println("Enter grade obtain in subject : ");
                grade[j] = sc.next();
                System.out.println("Enter subject credit for subject : ");
                credit[j] = sc.nextInt();
            }
            s[i] = new Student(idNo,noOfStudents,subCode,credit,grade);
           double spi = s[i].spiCal();
           System.out.println("Spi of student no."+(i+1)+" is = "+spi);
        }
    }
}