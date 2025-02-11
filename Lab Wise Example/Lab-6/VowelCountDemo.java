/*Create a class which ask the user to enter a sentence, and it should 
display count of each vowel type in the sentence. The program should continue till 
user enters a word “quit”. Display the total count of each vowel for all sentences.*/
import java.util.Scanner;
class VowelCount {
	public void count(){
		Scanner sc= new Scanner(System.in);
		while(true){
            System.out.println("Enter a String");
            String  name = sc.nextLine().toLowerCase();
            if(name.equals("quit")){
            	System.out.println("Thank You");
            	break;
            }
            int x = 0;
            int c = 0;
            int v = 0;
            int a = 0;
            int e = 0;
            int i = 0;
            int o = 0;
            int u = 0;

            for(x=0;x<name.length();x++){
            	if((name.charAt(x)=='a'))
            	{
            		v++;
                    a++;
            	}
                else if((name.charAt(x)=='e'))
                {
                    v++;
                    e++;
                }
                else if((name.charAt(x)=='i'))
                {
                    v++;
                    i++;
                }
                else if((name.charAt(x)=='o'))
                {
                    v++;
                    o++;
                }
                else if((name.charAt(x)=='u'))
                {
                    v++;
                    u++;
                }
                else if(name.charAt(i)==' '){
                }
            	else{
            		c++;
            	}
            }
            System.out.println("In given String number of wovel is : "+v);
            System.out.println("A later is ="+a);
            System.out.println("E later is ="+e);
            System.out.println("I later is ="+i);
            System.out.println("O later is ="+o);
            System.out.println("U later is ="+u);
            System.out.println("In given String number of Constant is : "+c);
        }
	}
	
}
public class VowelCountDemo {
	public static void main(String[] args) {
		VowelCount c = new VowelCount();
		c.count();
	}
}