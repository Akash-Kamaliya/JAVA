import java.util.*;

public class MapIterationExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Akash");
        map.put(2, "Kamaliya");
        map.put(3, "R");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());
    }
}
