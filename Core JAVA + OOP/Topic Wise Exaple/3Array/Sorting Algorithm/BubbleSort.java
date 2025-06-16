public class BubbleSort {
	public static void main (String [] args){
		int arr [] = {2,3,4,1,5};
		for(int i=0;i<arr.length-1;i++){
			boolean isSwap =false;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr [j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					isSwap = true ;
				}
			}
			if(!isSwap){
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}