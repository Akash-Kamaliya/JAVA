import java.util.Scanner;
class Student{
    String name;
    String enrollNo;
    public Student(String name,String enrollNo){
        this.name = name;
        this.enrollNo = enrollNo;
    }
    public void display(){
        System.out.println("Student name is "+this.name+" and enrollNo is "+this.enrollNo);
    }
}
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students : ");
        int noOfStudents = sc.nextInt();
        Student[] stu = new Student[noOfStudents];
        for(int i = 0 ; i<noOfStudents;i++){
            System.out.println("Enter student name ");
            String name = sc.next();
            System.out.println("Enter student enrollNo ");
            String enrollNo = sc.next();
            stu[i] = new  Student(name,enrollNo);
        }
        for(int i = 0;i<noOfStudents;i++){
            stu[i].display();
        }
    }
}