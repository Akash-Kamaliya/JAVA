import Static.Student;

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Akash");
        s.setAge(19);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
