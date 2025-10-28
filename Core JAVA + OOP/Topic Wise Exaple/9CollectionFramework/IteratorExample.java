import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript");

        for (String lang : languages) {
            System.out.println("Language: " + lang);
        }

        Iterator<String> it = languages.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator Value: " + it.next());
        }
    }
}
