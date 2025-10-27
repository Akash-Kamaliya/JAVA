public class ThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000); // Timed Waiting
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread completed.");
    }

    public static void main(String[] args) {
        ThreadLifeCycle t1 = new ThreadLifeCycle(); // New
        System.out.println("Thread state: " + t1.getState());
        t1.start(); // Runnable
        System.out.println("Thread state after start: " + t1.getState());
    }
}
