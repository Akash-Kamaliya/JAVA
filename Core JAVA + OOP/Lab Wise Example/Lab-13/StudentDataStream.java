import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("students2.dat"));
            dos.writeInt(1);
            dos.writeUTF("Akash");
            dos.writeDouble(9.2);

            dos.writeInt(2);
            dos.writeUTF("Ravi");
            dos.writeDouble(8.7);

            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("students2.dat"));
            while (dis.available() > 0) {
                int id = dis.readInt();
                String name = dis.readUTF();
                double spi = dis.readDouble();
                System.out.println("ID: " + id + ", Name: " + name + ", SPI: " + spi);
            }
            dis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
