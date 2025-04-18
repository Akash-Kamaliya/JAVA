import java.util.Scanner;
class Cube{
    double height;
    double width;
    double depth;
    public Cube(double height,double width,double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public void cal(){
        System.out.println(this.height * this.width * this.depth);
    }
}
public class CubeCal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cube[] cube = new Cube[2];
        for(int i = 0 ; i<2;i++){
            System.out.println("Enter height");
            double height = sc.nextDouble();
            System.out.println("Enter width ");
            double width = sc.nextDouble();
            System.out.println("Enter depth ");
            double depth = sc.nextDouble();
            cube[i] = new  Cube(height,width,depth);
            cube[i].cal();
        }
    }
}