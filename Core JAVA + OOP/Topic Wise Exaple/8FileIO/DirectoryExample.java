import java.io.File;

public class DirectoryExample {
    public static void main(String[] args) {
        File dir = new File("MyFolder");

        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Directory created: " + dir.getAbsolutePath());
        }

        File subDir = new File(dir, "SubFolder");
        subDir.mkdir();

        File file = new File(subDir, "note.txt");
        try {
            file.createNewFile();
            System.out.println("Created file: " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (File f : dir.listFiles()) {
            System.out.println((f.isDirectory() ? "[DIR] " : "[FILE] ") + f.getName());
        }
    }
}
