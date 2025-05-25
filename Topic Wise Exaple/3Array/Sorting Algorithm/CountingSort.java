public class CountingSort {
	public static void main (String [] args){
		int arr[] = {1,4,1,3,2,4,3,7};
		System.out.println("Orignal Array is =");
		for(int k = 0;k<arr.length;k++){
			System.out.print(" "+arr[k]);
		}
		int largest = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			largest = Math.max(largest,arr[i]);
		}
		int count[] = new int [largest+1];
		for(int i = 0;i<arr.length ; i++){
			count[arr[i]]++;
		}
		//sorting
		int j = 0;
		for(int i = 0;i<count.length;i++){
			while(count[i]>0){
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
		System.out.println();
		System.out.println("After Sorting Array is =");
		for(int a = 0;a<arr.length;a++){
			System.out.print(" "+arr[a]);
		}
	}
}