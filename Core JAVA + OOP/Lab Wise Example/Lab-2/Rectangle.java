import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a side of Ractangle");
		int a = sc.nextInt();
		System.out.println("Enter a side of Ractangle");
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("Area of ractangle=" + c);
		sc.close();
	}
}