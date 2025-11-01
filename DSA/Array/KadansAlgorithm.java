public class KadansAlgorithm {
	public int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]); 
            ms = Math.max(ms, cs);
        }

        return ms;
    }
	public static void kadansAlgorithm(int num[]) {
		int ms = Integer.MIN_VALUE;
		int cs = 0;

		for(int i = 0 ; i<num.length ; i++){
			cs = cs + num[i];
			if(cs<0){
				cs=0;
			}
			ms =Math.max(cs,ms);
		}
		System.out.println("Max Sum is =" + ms);
	}
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		kadansAlgorithm(num);
	}
}