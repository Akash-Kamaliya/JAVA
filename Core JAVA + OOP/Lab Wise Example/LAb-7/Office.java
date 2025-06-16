
class Member{
    String name;
    int age;
    int phoneNo;
    String address;
    int salary;
    public Member(String name,int age,int phoneNo,String address,int salary){
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
    }
    public void printSalary(){
        System.out.println("Salary is = "+this.salary);
    }
}
class Employee extends Member{
    String specialization;
    String department;
    public Employee(String name,int age,int phoneNo,String address,int salary,String specialization,String department){
        super(name,age,phoneNo,address,salary);
        this.specialization = specialization;
        this.department = department;
    }
    public void display(){
        super.printSalary();
        System.out.println("Specilization is "+this.specialization+" Department is "+this.department);
    }
}
class Manager extends Member{
    String specialization;
    String department;
    public Manager(String name,int age,int phoneNo,String address,int salary,String specialization,String department){
        super(name,age,phoneNo,address,salary);
        this.specialization = specialization;
        this.department = department;
    }
    public void display(){
        super.printSalary();
        System.out.println("Specilization is "+this.specialization+" Department is "+this.department);
    }
}

public class Office{
    public static void main(String[] args){
        String name = "hello";
        int age = 35;
        int phoneNo = 123;
        String address = "hi";
        int salary = 20000;
        String specialization = "dep";
        String department = "it";
        Employee e1 = new Employee(name,age,phoneNo,address,salary,specialization,department);
        Manager m1 = new Manager(name,age,phoneNo,address,salary,specialization,department);
        e1.display();
        m1.display();
    }
}
