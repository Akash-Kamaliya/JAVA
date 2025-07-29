package DSA.ArrayList;
import java.util.*;
public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //Add Operation ..........................
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add("hello");
        list2.add("hi");
        list3.add(true);
        list3.add(false);
        //Get Operation ...............................
        int a = list1.get(2);
        String b = list2.get(1);
        boolean c = list3.get(1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //other Example..............................
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Initial List: " + fruits);

        String fruitAtIndex2 = fruits.get(2);
        System.out.println("Element at index 2: " + fruitAtIndex2);

        fruits.remove(1); 
        System.out.println("After removing index 1: " + fruits);

        fruits.set(1, "Grapes"); 
        System.out.println("After setting index 1 to Grapes: " + fruits);

        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains 'Apple'? " + hasApple);

        int size = fruits.size();
        System.out.println("Size of the list: " + size);
    }
}
