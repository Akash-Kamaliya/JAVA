import java.util.Scanner;
class Circle {
	double r;
	double area;
	public void area(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of a Circle:");
		this.r = sc.nextDouble();
		this.area = 3.14 * this.r * this.r;
		System.out.println("The Area of a Circle is:"+this.area);
		sc.close();
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
	}
}