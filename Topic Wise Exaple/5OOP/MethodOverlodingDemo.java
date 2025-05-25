public class MethodOverlodingDemo {
	public static void main (String[]args){
		int ans1 =sum(5,2);
		int ans2 = sum(5,2,6);
		double ans3 = sum(5,6,8.5);
		System.out.println("ans1 = "+ ans1);
		System.out.println("ans2 = "+ ans2);
		System.out.println("ans3 = "+ ans3);

	}
	static int sum (int x, int y){
		return (x+y);
	}
	static int sum(int x, int y , int z){
		return (x+y+z);
	}
	static double sum(double x, double y, double z){
		return (x+y+z);
	}
}