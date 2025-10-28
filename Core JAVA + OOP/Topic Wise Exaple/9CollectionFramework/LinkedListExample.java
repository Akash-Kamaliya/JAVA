import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(25);

        System.out.println("LinkedList: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After Removing First & Last: " + list);
    }
}
