import java.util.Scanner;
public class Prime{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
            System.out.println("Enter a");
            int a = sc.nextInt();
            int n=2;
            while(n<Math.sqrt(a)){
            	 if(a%n==0){
                    System.out.println("The number is  Not  Prime :");
            	       return;
            	}
                    n++;
            }
                    System.out.println("The number is   Prime :");
	}	
}