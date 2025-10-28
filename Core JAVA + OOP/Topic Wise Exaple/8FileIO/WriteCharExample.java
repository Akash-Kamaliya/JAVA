import java.io.FileWriter;
import java.io.IOException;

public class WriteCharExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("textdata.txt")) {
            writer.write("Hello Akash!\n");
            writer.write("Welcome to Character Stream in Java.\n");
            writer.write("This stream handles characters, not bytes!");
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
