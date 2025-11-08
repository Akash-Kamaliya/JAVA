import java.util.*;

class StudentSPI {
    int id;
    String name;
    int rollNo;
    double spi;

    StudentSPI(int id, String name, int rollNo, double spi) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.spi = spi;
    }

    public String toString() {
        return id + " " + name + " " + rollNo + " " + spi;
    }
}

public class SortBySPI {
    public static void main(String[] args) {
        ArrayList<StudentSPI> list = new ArrayList<>();
        list.add(new StudentSPI(1, "Akash", 101, 9.2));
        list.add(new StudentSPI(2, "Ravi", 102, 8.7));
        list.add(new StudentSPI(3, "Karan", 103, 9.0));

        list.sort((a, b) -> Double.compare(b.spi, a.spi));

        System.out.println("Sorted by SPI (Descending):");
        for (StudentSPI s : list)
            System.out.println(s);
    }
}
