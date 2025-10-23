import Student;

package ClassObject;
class Student {
    static String university = "Darshan University";
    String name;
    int rollNumber;
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    static void changeUniversity(String newUniversity) {
        university = newUniversity;
    }
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", University: " + university);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Akash", 101);
        Student s2 = new Student("Raj", 102);
        s1.display();
        s2.display();
        Student.changeUniversity("RRU University");
        s1.display();
        s2.display();
    }
}
