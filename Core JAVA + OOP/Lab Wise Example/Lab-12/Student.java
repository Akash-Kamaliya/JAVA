import java.io.Serializable;

public class Student implements Serializable {
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
