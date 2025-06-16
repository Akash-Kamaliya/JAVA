public class PrintSubArray {
	public static void printSubArray(int num[]) {
		for(int i = 0 ;i<num.length ; i++){
			int start = i;
			for(int j = 1 ;j < num.length ; j++){
				int end = j ;
				for(int  k = start ; k<= end ; k++){
					System.out.print(num[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		printSubArray(num);
	}
}