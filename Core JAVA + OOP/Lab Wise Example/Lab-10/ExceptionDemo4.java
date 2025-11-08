import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(sc.nextLine());

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero not allowed.");
        }
        sc.close();
    }
}
