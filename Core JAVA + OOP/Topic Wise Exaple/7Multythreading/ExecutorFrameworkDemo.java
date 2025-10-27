import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    public void run() {
        System.out.println("Executing task by " + Thread.currentThread().getName());
    }
}

public class ExecutorFrameworkDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(new MyTask());
        }

        executor.shutdown();
    }
}
