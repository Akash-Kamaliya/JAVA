public class ImplementingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface...");
    }

    public static void main(String[] args) {
        ImplementingRunnable r1 = new ImplementingRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
