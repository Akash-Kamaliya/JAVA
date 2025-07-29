package DSA.ArrayList;
import java.util.ArrayList;
public class ArrayListReverseDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        System.out.println("List in Reverse Order:");
        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.println(fruits.get(i));
        }
    }
}
