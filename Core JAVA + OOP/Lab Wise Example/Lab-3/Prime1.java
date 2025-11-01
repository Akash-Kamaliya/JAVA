import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();
        prime(start, end);
        sc.close();
    }

    public static void prime(int a, int b) {
        System.out.println("Prime numbers between " + a + " and " + b + " are:");
        for (int i = a; i <= b; i++) {
            int c = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
