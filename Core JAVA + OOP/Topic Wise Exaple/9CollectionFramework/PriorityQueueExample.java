import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("PriorityQueue: " + queue);
        System.out.println("Head Element: " + queue.peek());
        queue.poll(); // remove head
        System.out.println("After Removing Head: " + queue);
    }
}
