import java.util.*;

class StudentList {
    int id;
    String name;
    int rollNo;
    double spi;

    StudentList(int id, String name, int rollNo, double spi) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.spi = spi;
    }

    public String toString() {
        return id + " " + name + " " + rollNo + " " + spi;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<StudentList> list = new ArrayList<>();
        list.add(new StudentList(1, "Akash", 101, 9.2));
        list.add(new StudentList(2, "Ravi", 102, 8.7));
        list.add(new StudentList(3, "Karan", 103, 9.0));

        System.out.println("Student List:");
        for (StudentList s : list)
            System.out.println(s);
    }
}
