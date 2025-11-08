import java.io.*;
import java.util.*;


class Student implements Serializable {
    int id;
    String name;
    double spi;

    public Student(int id, String name, double spi) {
        this.id = id;
        this.name = name;
        this.spi = spi;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", SPI: " + spi);
    }
}


public class StudentManager {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("students.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            List<Student> list = new ArrayList<>();
            list.add(new Student(1, "Akash", 9.2));
            list.add(new Student(2, "Ravi", 8.7));
            list.add(new Student(3, "Karan", 9.0));

            for (Student s : list)
                oos.writeObject(s);

            oos.close();
            System.out.println(" Data written successfully to students.dat\n");

            FileInputStream fis = new FileInputStream("students.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("📘 Reading student data from file:");
            while (true) {
                try {
                    Student s = (Student) ois.readObject();
                    s.display();
                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();

        } catch (Exception e) {
            System.out.println(" Error: " + e);
        }
    }
}
