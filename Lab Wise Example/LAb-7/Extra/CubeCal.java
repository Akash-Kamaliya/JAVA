import java.util.Scanner;
class Cube {
    double height;
    double weight;
    double length;
    public Cube(double height,double weight,double length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }
    public double cal(){
        return this.height * this.weight * this.length;
    }
}
public class CubeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cube cube[2] = new Cube[2];
        for(int i=0;i<2;i++){
            System.out.println("Enter Height :");
            double height = sc.nextDouble();
            System.out.println("Enter Weight :");
            double weight = sc.nextDouble();
            System.out.println("Enter Lenght :");
            double length = sc.nextDouble();
            cube[0].
        }
    }
}
