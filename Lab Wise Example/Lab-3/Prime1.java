import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            }
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
