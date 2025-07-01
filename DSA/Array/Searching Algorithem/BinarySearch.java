import java.util.Scanner;
public class BinarySearch{
	public static void main(String [] args){
		int array [] =  {2,5,7,10,11,15,20,45,55,67};
		Scanner sc= new Scanner(System.in);
		System.out.println("Which number you want to find :");
		int searchNumber = sc.nextInt();
		int low =0 ;
		int high = array.length-1;
		boolean isFound = false ;
		while(high>=low){
			int mid = (high + low )/2;
			if(searchNumber<array[mid]){
				high = mid -1;
			}
			else if(searchNumber == array[mid]){
				System.out.println("Found at = "+mid+" Place");
				isFound = true;
				break;
			}
			else{
				low = mid +1;
			}
		}
		if(!isFound){
			System.out.println("Number Doed not exist in array:");
		}
		sc.close();
	}
}