import java.io.*;

public class FileChecker {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileChecker <path>");
            return;
        }

        File f = new File(args[0]);

        if (f.isFile())
            System.out.println("File size: " + f.length() + " bytes");
        else if (f.isDirectory()) {
            System.out.println("Directory contents:");
            String[] files = f.list();
            for (String file : files)
                System.out.println(file);
        } else
            System.out.println("Invalid path!");
    }
}
