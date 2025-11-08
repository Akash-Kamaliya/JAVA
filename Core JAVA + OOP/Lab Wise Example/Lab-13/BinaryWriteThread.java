import java.io.*;

class WriteThread extends Thread {
    private String data;
    private String filename;

    WriteThread(String data, String filename) {
        this.data = data;
        this.filename = filename;
    }

    public void run() {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            for (char c : data.toCharArray()) {
                fos.write(c);
                Thread.yield();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

public class BinaryWriteThread {
    public static void main(String[] args) throws InterruptedException {
        WriteThread t1 = new WriteThread("Hello Akash!", "binary.dat");
        t1.start();
        t1.join();
        System.out.println("File written successfully!");
    }
}
