import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Akash");
        map.put(2, "Ramesh");
        map.put(3, "Darshan University");

        System.out.println("HashMap: " + map);

        System.out.println("Value at key 2: " + map.get(2));

        map.remove(3);
        System.out.println("After Removal: " + map);
    }
}
