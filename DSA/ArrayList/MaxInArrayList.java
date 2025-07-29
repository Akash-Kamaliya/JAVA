package DSA.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class MaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(55);
        numbers.add(32);

        System.out.println("List: " + numbers);

        int max1 = Collections.max(numbers);
        System.out.println("Maximum (using Collections): " + max1);

        int max2 = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max2) {
                max2 = numbers.get(i);
            }
        }
        System.out.println("Maximum (using loop): " + max2);
    }
}
