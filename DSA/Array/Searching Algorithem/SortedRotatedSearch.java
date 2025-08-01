public class SortedRotatedSearch {
    public static int search(int arr[] , int tar , int si , int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei - si)/2;//(si + ei)/2
        //case Found
        if(arr[mid] == tar){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a : Left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            else{
                //case b : right
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on L2
        else{
            //case C : right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                //case D : left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int targer = 0;
        int tarIdx = search(arr, targer, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
