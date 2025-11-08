import java.io.*;

public class StudentBuffered {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
            bw.write("1,Akash,9.2\n");
            bw.write("2,Ravi,8.7\n");
            bw.write("3,Karan,9.0\n");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            System.out.println("Student Data from file:");
            while ((line = br.readLine()) != null)
                System.out.println(line);
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
