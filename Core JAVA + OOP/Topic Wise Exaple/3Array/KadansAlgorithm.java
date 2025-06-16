import java.util.*;
public class KadansAlgorithm {
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