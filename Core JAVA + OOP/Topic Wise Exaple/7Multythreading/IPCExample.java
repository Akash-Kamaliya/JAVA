import java.io.*;

class Sender extends Thread {
    PipedOutputStream out;

    Sender(PipedOutputStream out) {
        this.out = out;
    }

    public void run() {
        String message = "Hello from Sender!";
        try {
            out.write(message.getBytes());
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Receiver extends Thread {
    PipedInputStream in;

    Receiver(PipedInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class IPCExample {
    public static void main(String args[]) throws IOException {
        PipedOutputStream pout = new PipedOutputStream();
        PipedInputStream pin = new PipedInputStream();

        pout.connect(pin);

        Sender sender = new Sender(pout);
        Receiver receiver = new Receiver(pin);

        sender.start();
        receiver.start();
    }
}
