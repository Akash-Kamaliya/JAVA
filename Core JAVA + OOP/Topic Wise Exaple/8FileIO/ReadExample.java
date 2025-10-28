import java.io.FileInputStream;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("byteoutput.txt");

            int i;
            while ((i = fin.read()) != -1) { // -1 means end of file
                System.out.print((char) i);  // convert byte to char for display
            }

            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
