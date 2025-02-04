import java.util.Scanner;
public class LinearSearch{
	public static void main(String [] args){
		int array [] =  {11,2,13,4,15,6,17,8,19,10};
		Scanner sc= new Scanner(System.in);
		System.out.println("Which number you want to find :");
		int searchNumber = sc.nextInt();
		boolean flag = false ;
		for (int i=0;i<array.length;i++){
			if(array[i]==searchNumber){
				System.out.println("Found at = "+(i+1)+" Place");
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println("Number Doed not exist in array:");
		}
	}
}