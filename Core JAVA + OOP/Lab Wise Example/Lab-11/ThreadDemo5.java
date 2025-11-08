import java.util.Random;

class NumberThread extends Thread {
    int num;
    Random rand = new Random();

    public void run() {
        try {
            while (true) {
                num = rand.nextInt(100);
                System.out.println("Generated Number: " + num);
                if (num % 2 == 0)
                    new SquareThread(num).start();
                else
                    new CubeThread(num).start();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class SquareThread extends Thread {
    int n;
    SquareThread(int n) { this.n = n; }
    public void run() {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

class CubeThread extends Thread {
    int n;
    CubeThread(int n) { this.n = n; }
    public void run() {
        System.out.println("Cube of " + n + " = " + (n * n * n));
    }
}

public class ThreadDemo5 {
    public static void main(String[] args) {
        new NumberThread().start();
    }
}
