package DSA.Queue;

public class Operation {
    public static class QueueA {
        static int arr[];
        static int size;
        static int rear;

        QueueA(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // add O(1)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        QueueA q = new QueueA(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
