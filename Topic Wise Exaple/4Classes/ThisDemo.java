class Box {
		double length;
		double breadth;
		double height;
		Box(double length , double breadth , double height){
			System.out.println("Constructing Box");
			this.length = length;
			this.breadth = breadth;
			this.height = height;
		}
		void volume(){
			double volume = length * breadth * height;
			System.out.println("Volume is = "+volume); 
		}
}
public class ThisDemo {
	public static void main(String [] args){
			Box myBox1 = new Box(10,20,30);
			Box myBox2 = new Box(3,6,9);
			myBox1.volume();
			myBox2.volume();
	}
}