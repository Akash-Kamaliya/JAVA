package DSA.Queue;

public class CircularQueue {
    public static class QueueB {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        QueueB(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            // Last el delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        QueueB q = new QueueB(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6); 

        while (!q.isEmpty()) {
            System.out.println("Front element: " + q.peek());
            q.remove();
        }

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Front element now: " + q.peek());

        q.remove();
        q.add(40);
        q.add(50);
        q.add(60);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}