import java.util.Scanner;
public class Prime{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
            System.out.println("Enter a");
            int a = sc.nextInt();
            int n=2;
            int c=0;
            while(n<a){
            	if(a%n==0){
            		c++;
            	}
            	n++;
            }
            if(c==0){
            	System.out.println("The Given Number is Prime");
            }
            else{
            	System.out.println("The Given Number is Not  Prime");
            }
	}	
}