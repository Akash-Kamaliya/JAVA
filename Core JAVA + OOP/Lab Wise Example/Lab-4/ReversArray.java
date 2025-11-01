import java.util.Scanner;

public class ReversArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to input :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter arrays Element one by one :");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter arrays Element " + (i + 1));
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n / 2; i++) {
			int a = arr[i];
			int b = arr[n - i - 1];
			arr[i] = b;
			arr[n - i - 1] = a;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
		sc.close();
	}
}