class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2)
            System.out.println("Odd: " + i);
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2)
            System.out.println("Even: " + i);
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        new OddThread().start();
        new EvenThread().start();
    }
}
