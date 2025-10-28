import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharFile {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("textdata.txt");
             FileWriter fw = new FileWriter("copy_textdata.txt")) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("Text file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
