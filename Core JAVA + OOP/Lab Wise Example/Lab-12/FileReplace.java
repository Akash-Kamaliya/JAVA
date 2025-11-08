import java.io.*;

public class FileReplace {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (line.contains("word1")) {
                    count += line.split("word1", -1).length - 1;
                    line = line.replaceAll("word1", "word2");
                }
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Replacement count: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
