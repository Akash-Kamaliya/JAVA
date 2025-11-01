import java.util.Scanner;

public class Pivot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size oa Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element of Array in Asscending Order:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Your given Array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println("Enter Target Eliment :");
		int t = sc.nextInt();
		int num = n - t;
		for (int j = 0; j < num; j++) {
			int temp = arr[j];
			arr[j] = arr[t];
			arr[t] = temp;
			t++;
		}
		for (int i = num; i < arr.length - 1; i++) {
			int smallestIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[smallestIdx]) {
					smallestIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallestIdx];
			arr[smallestIdx] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " , ");
		}
		sc.close();
	}
}