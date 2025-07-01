public class MaxSumArray {
	public static void maxSumArray(int num[]) {
		int maxSum = 0;
		for(int i = 0 ;i<num.length ; i++){
			int start = i;
			for(int j = 1 ;j < num.length ; j++){
				int end = j ;
				int sum = 0;
				for(int  k = start ; k<= end ; k++){
					sum +=num[k];
					maxSum = Math.max(sum,maxSum);
				}
			}
		}
		System.out.println("Max Sum is =" + maxSum);
	}
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		maxSumArray(num);
	}
}