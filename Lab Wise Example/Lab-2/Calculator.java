import java.util.Scanner;
public class Calculator{
	public static void main(String[]args){
            double d;
		    Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            String c=sc.next();
            if(c.equals("-"))
            {
                d=a-b;
                System.out.println("a-b="+d);
            }
            else if(c.equals("+"))
            {
                d=a+b;
                System.out.println("a+b="+d);
            }
            else if(c.equals("*"))
            {
                d=a*b;
                System.out.println("a*b="+d);
            }
            else if(c.equals("/"))
            {
                d=a/b;
                System.out.println("a/b="+d);
            }
            else{
                System.out.println("Please Enter Valid Performance");
            }
    }
}
