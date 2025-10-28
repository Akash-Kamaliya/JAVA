import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(40, 10, 30, 20);
        System.out.println("Original: " + numbers);

        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending: " + numbers);
    }
}
