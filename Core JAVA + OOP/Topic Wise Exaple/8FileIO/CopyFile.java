import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("source.jpg");
            FileOutputStream fout = new FileOutputStream("copy.jpg");

            int data;
            while ((data = fin.read()) != -1) {
                fout.write(data);
            }

            fin.close();
            fout.close();
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
