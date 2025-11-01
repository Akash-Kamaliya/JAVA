class Complex {
    double img;
    double real;
    public Complex(){
        this.img = 5;
        this.real =10;
    }
    public Complex(double img , double real){
        this.img = img ;
        this.real = real ;
    }
    void sum(Complex c) {
        this.img = this.img+c.img;
        this.real = this.real + c.real;
    }
}
public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(3.5,4.5);
        c1.sum(c2);
        System.out.println("Sum = "+c1.img+"i" +"+"+c1.real);
    }
}