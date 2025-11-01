import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter Distance in Meter");
            double a = sc.nextDouble();
            double f = a*3.28084 ;
            System.out.println("The Distance in Feet is  = "+f);
            sc.close();
    }
}
