import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Maths :");
		int a = sc.nextInt();
		System.out.println("Enter Marks of Web Dev :");
		int b = sc.nextInt();
		System.out.println("Enter Marks of Java :");
		int c = sc.nextInt();
		System.out.println("Enter Marks of Enginner Grafics :");
		int d = sc.nextInt();
		System.out.println("Enter Marks of English :");
		int e = sc.nextInt();
		double r = (a + b + c + d + e) / 5.0;
		if (r >= 60) {
			System.out.println("Congratukation !! Your Division is first : ");
		} else if (r >= 50 && r < 60) {
			System.out.println("Congratukation !! Your Division is second : ");
		} else if (r >= 40 && r < 50) {
			System.out.println("Congratukation !! Your Division is Third : ");
		} else if (r < 40) {
			System.out.println("Congratukation !! Your Division is FIAL : ");
		}
		sc.close();
	}
}