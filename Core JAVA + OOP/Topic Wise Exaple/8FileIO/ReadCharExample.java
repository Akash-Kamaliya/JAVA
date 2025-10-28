import java.io.FileReader;
import java.io.IOException;

public class ReadCharExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("textdata.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch); // convert int to char
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
