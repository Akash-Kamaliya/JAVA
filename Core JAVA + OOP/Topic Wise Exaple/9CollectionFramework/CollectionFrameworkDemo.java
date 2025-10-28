import java.util.*;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Akash");
        students.add("Ramesh");
        students.add("Darshan");
        students.add("Akash"); 

        System.out.println("List (ArrayList): " + students);


        Set<String> uniqueStudents = new HashSet<>(students);
        System.out.println("Set (HashSet): " + uniqueStudents);


        Queue<String> queue = new LinkedList<>(students);
        System.out.println("Queue: " + queue);
        System.out.println("Processing (poll): " + queue.poll());
        System.out.println("After poll: " + queue);


        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Akash");
        studentMap.put(102, "Ramesh");
        studentMap.put(103, "Darshan");

        System.out.println("Map (HashMap): " + studentMap);
        System.out.println("Student with ID 102: " + studentMap.get(102));
    }
}
