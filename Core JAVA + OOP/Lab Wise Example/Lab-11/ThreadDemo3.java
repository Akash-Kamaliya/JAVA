class Company {
    int n;
    boolean f = false;

    synchronized public void produce(int n) {
        if (f) {
            try {
                wait();
            } catch (Exception e) {}
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume() {
        if (!f) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
        return this.n;
    }
}

class Producer extends Thread {
    Company c;
    Producer(Company c) { this.c = c; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            c.produce(i);
        }
    }
}

class Consumer extends Thread {
    Company c;
    Consumer(Company c) { this.c = c; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            c.consume();
        }
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        Company c = new Company();
        Producer p = new Producer(c);
        Consumer con = new Consumer(c);
        p.start();
        con.start();
    }
}
