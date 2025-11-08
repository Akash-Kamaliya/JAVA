class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo1B {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread A");
        Thread t2 = new Thread(new MyRunnable(), "Thread B");
        t1.start();
        t2.start();
    }
}
