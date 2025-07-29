package DSA.ArrayList;
import java.util.ArrayList;
// import java.util.Collections;

public class SwapInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before Swap: " + numbers);

        int index1 = 1; // value = 20
        int index2 = 3; // value = 40

        // Method 1: Using Collections.swap()
        // Collections.swap(numbers, index1, index2);

        // System.out.println("After Swap (using Collections): " + numbers);

        // OR — Method 2: Manually swap using get() and set()
        
        int temp = numbers.get(index1);
        numbers.set(index1, numbers.get(index2));
        numbers.set(index2, temp);
        System.out.println("After Swap (manual method): " + numbers);
        
    }
}

