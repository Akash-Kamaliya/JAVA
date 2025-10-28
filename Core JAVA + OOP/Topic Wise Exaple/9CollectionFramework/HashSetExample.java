import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored

        System.out.println("HashSet Elements: " + set);
    }
}
