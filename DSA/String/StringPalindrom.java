import java.util.Scanner;
public class StringPalindrom {
	public static boolean isPalindrom(String str) {
		for(int i = 0; i < str.length()/2;i++){
			int n = str.length();
			if(str.charAt(i)!=str.charAt(n-i-1)){
				//not a palindrom
				System.out.println("String is Not Palindrom");
				return false;
			}
		}
		System.out.println("String is Palindrom");
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String name = sc.next();
		isPalindrom(name);
		sc.close();
	}
}