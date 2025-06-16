import java.util.*;
public class PrefixSubArraySum {
	public static void prefixSubArraySum(int num[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE ;
		int prefix [] = new int[num.length];

		prefix[0] = num[0];
		//calculation of prefix Array
		for(int i = 1 ; i<prefix.length ;i++){
			prefix[i] = prefix[i-1] + num[i];
		}

		for(int i = 0; i<num.length ;i++){
			int start = i;
			for(int j = 1 ; j<num.length ;j++){
				int end = j;
				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
				maxSum = Math.max(maxSum,currSum);
			}
		}
		System.out.println("Max Sum = " + maxSum);
	}
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		prefixSubArraySum(num);
	}
}