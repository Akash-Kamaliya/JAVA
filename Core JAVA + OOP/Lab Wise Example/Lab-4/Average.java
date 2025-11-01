import java.util.Scanner;
public class Average{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("How many number you want to input :");
		int n = sc.nextInt();
		int [] avg = new int[n];
		int totle=0;
		double num = 0;
		System.out.println("Enter arrays Element one by one :");
		for (int i=0;i<n;i++){
			System.out.println("Enter arrays Element "+(i+1));
			avg[i] = sc.nextInt();
			totle+=avg[i];
			num++;
		}
		System.out.println("The Avarage of given number is ="+(totle/num));
		sc.close();
	}
}