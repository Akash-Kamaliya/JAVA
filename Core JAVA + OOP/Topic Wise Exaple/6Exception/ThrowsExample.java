import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
        fr.read();
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile(); 
        } catch (IOException e) {
            System.out.println("Handled IOException: " + e.getMessage());
        }
    }
}
