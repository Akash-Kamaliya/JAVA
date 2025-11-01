import java.util.Scanner;

public class FindLength {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String name = sc.nextLine();
            int n = name.length();
            System.out.println("The Second half of String");
            for (int i = n / 2; i < name.length(); i++) {
                  System.out.print(name.charAt(i));
            }
            sc.close();
      }
}
