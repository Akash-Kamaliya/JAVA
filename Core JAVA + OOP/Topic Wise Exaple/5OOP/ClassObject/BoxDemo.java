package ClassObject;
class Box {
		double length;
		double breadth;
		double height;
}
public class BoxDemo {
	public static void main(String [] args){
			Box myBox1 = new Box();
			Box myBox2 = new Box();
			double vol;

			myBox1.length = 10;
			myBox1.breadth = 20;
			myBox1.height = 30 ;

			myBox2.length = 3;
			myBox2.breadth = 6;
			myBox2.height = 9;

			vol = myBox1.length * myBox1.breadth * myBox1.height ;
			System.out.println("Volume of Box 1 is = " + vol);
			vol = myBox2.length * myBox2.breadth * myBox2.height ;
			System.out.println("Volume of Box 1 is = " + vol);
	}
}