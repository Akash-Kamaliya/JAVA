import java.lang.Math;

interface Shape{
    public double getArea();
}



class Rectangle implements Shape{
    double length;
    double breath;
    Rectangle(double length,double breath){
        this.length = length;
        this.breath = breath;
    }
    public double getArea(){
        return this.length * this.breath;
    }
}



class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}



class Triangle implements Shape{
    double height;
    double base;
    Triangle(double height,double base){
        this.height = height;
        this.base = base;
    }
    public double getArea(){
        return 0.5 * this.height * this.base;
    }
}

public class Area{
    public static void main(String[] args){
        Rectangle r = new Rectangle(2.00,3.00);
        Circle c = new Circle(10.0);
        Triangle t = new Triangle(3.0,4.0);
        System.out.println("Area of rectangle is "+r.getArea());
        System.out.println("Area of circle is "+c.getArea());
        System.out.println("Area of triangle is "+t.getArea());
    }
}
