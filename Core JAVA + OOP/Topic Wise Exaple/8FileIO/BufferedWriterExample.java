import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_output.txt"))) {
            bw.write("Hello Akash!");
            bw.newLine(); 
            bw.write("BufferedWriter writes text efficiently.");
            bw.newLine();
            bw.write("It uses a memory buffer to speed up I/O operations.");
            bw.flush();
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
