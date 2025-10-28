import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileExample {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("data.txt");
             FileOutputStream fout = new FileOutputStream("copy.txt")) {

            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file:");
            e.printStackTrace();
        }
    }
}
