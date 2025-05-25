import java.util.*;
public class TrappedRainWater {
	public static int trappedRainWater(int height[]) {
		int n = height.length;

		// calculate left max Boundry in array

		int leftMax[] = new int[n];
		leftMax[0] = height[0];
		for(int i = 1 ;i<n;i++){
			leftMax[i] = Math.max(height[i],leftMax[i-1]);
		} 

		// calculate right max Boundry in array

		int rightMax[] = new int[n];
		rightMax[n-1] = height[n-1];
		for(int i = n-2 ;i>=0;i--){
			rightMax[i] = Math.max(height[i],rightMax[i+1]);
		} 

		int trappedRainWater = 0;

		// Loop

		for(int i = 0 ; i<n;i++){
			//water level  = min (left Max bound , right max bound)
			int waterLevel = Math.min(leftMax[i] , rightMax [i]);
			//trapped raain water = waater Level - Height[i]
			trappedRainWater += waterLevel - height[i];
		} 
		return trappedRainWater;
	}
	public static void main(String[] args) {
		int height[] = {4,2,1,6,3,2,5};
		System.out.println("Trapped Rain Water = " + trappedRainWater(height));
	}
}