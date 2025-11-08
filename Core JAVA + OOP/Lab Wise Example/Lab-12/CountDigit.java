import java.io.*;

public class CountDigit {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java CountDigit <filename>");
            return;
        }

        String filename = args[0];
        int count = 0;

        try (FileReader fr = new FileReader(filename)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                if (ch == '5') count++;
            }
            System.out.println("Number of occurrences of digit 5: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
