import java.io.*;

public class BufferedCopyExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("source.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("destination.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File copied successfully using Buffered Streams!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
