import java.util.*;

public class CollectionHierarchyExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Akash");
        list.add("Kamaliya");
        list.add("Akash"); // duplicate allowed

        Set<String> set = new HashSet<>();
        set.add("Akash");
        set.add("Kamaliya");
        set.add("Akash"); // duplicate ignored

        System.out.println("List Elements: " + list);
        System.out.println("Set Elements: " + set);
    }
}
