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
            int i = 0;
            int c = 0;
            int v = 0;
            for(i=0;i<name.length();i++){
            	if((name.charAt(i)=='a')||(name.charAt(i)=='e')||(name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u'))
            	{
            		v++;
            	}
                else if(name.charAt(i)==' '){
                }
            	else{
            		c++;
            	}
            }
            System.out.println("In given String number of wovel is : "+v);
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