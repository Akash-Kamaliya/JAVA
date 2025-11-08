import java.io.*;

public class FileCount {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            if (!file.exists()) {
                System.out.println("File not found!");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            int charCount = 0, wordCount = 0, lineCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
