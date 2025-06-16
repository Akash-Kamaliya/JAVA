public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
