package DSA.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(33);
        numbers.add(5);

        System.out.println("Before Sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting (Ascending): " + numbers);

        Collections.reverse(numbers);

        System.out.println("After Sorting (Descending): " + numbers);
    }
}

