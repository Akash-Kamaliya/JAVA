import java.util.*;
public class Temp{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 For Celcius to Ferenhit:");
		System.out.println("Enter 2 For Ferenhit to Celcius:");
		int a = sc.nextInt();
		if(a==1)
		{
			System.out.println("Enter Temperatur in Celcius :");
			double c = sc.nextDouble();
			double f = (c * (9.0 / 5.0)) + 32.0;
			System.out.println("Answer in Ferenhit :"+f);
		}
		else if(a==2)
		{
			System.out.println("Enter Temperatur in Ferenhit :");
			double f = sc.nextDouble();
			double c = (f - 32.0) * (5.0 / 9.0);
			System.out.println("Answer in Celcius :"+c);
		}
		else{
			System.out.println("Enter a valid number:");
			System.out.println("!!!!!!");
		}
	}
}