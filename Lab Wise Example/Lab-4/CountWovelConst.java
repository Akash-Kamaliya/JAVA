import java.util.Scanner;
public class CountWovelConst {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
            System.out.println("Enter a String");
            String  name = sc.nextLine();
            int i = 0;
            int c = 0;
            int v = 0;
            for(i=0;(name.charAt(i)).equals("\0");i++){
            	if(true)
            	{
            		v++;
            	}
            	else{
            		c++;
            	}
            }
            System.out.println("In given String number of wovel is : "+v);
            System.out.println("In given String number of Constant is : "+c);
	}
}
//||name.charAt(i).equals("e")||name.charAt(i).equals("i")||name.charAt(i).equals("o")||name.charAt(i).equals("u")