import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Akash");
        list.add("R");
        list.add("Kamaliya");
        list.add("Akash"); // duplicate allowed

        System.out.println("List Elements: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'R'? " + list.contains("R"));

        list.remove("Kamaliya");
        System.out.println("After Removing: " + list);

        list.set(1, "Darshan"); // replace element
        System.out.println("After Modification: " + list);
    }
}
