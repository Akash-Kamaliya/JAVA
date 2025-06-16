import java.util.Scanner;
public class Max{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();
            System.out.println("Enter b");
            int c = sc.nextInt();
            int max = (a > b) 
                    ? ((a > c) ? a : c) 
                    : ((b > c) ? b : c);
        System.out.println("The maximum number is: " + max);
	}
} 