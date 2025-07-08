import java.util.LinkedList;
public class CollectionFW {
    public static void main(String[] args) {
        //Create - Object (Integer)
        LinkedList<Integer> ll = new LinkedList<>();
        //Add 
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(0);
        //2 -> 1 -> 0
        //remove
        // ll.removeFirst();
        // ll.removeLast();
        System.out.println(ll);
    }
}
