import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");

            if (file.exists()) {
                System.out.println("File already exists: " + file.getAbsolutePath());
            } else {
                file.createNewFile();
                System.out.println("File created successfully!");
            }

            System.out.println("File name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Size: " + file.length() + " bytes");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
