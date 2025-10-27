class Company {
    int n;
    boolean f = false;

    synchronized public void produce_item(int n) throws InterruptedException {
        if (f) wait();
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws InterruptedException {
        if (!f) wait();
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
        int i = 1;
        while (i <= 5) {
            try { c.produce_item(i++); Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    Company c;
    Consumer(Company c) { this.c = c; }
    public void run() {
        while (true) {
            try { c.consume_item(); Thread.sleep(1500); } catch (Exception e) {}
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();
    }
}
