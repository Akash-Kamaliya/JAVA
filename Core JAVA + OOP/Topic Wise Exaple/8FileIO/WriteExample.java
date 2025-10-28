import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("byteoutput.txt");

            String text = "Hello Akash! Welcome to Byte Stream in Java.";
            byte[] data = text.getBytes();

            fout.write(data);
            fout.close();

            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
