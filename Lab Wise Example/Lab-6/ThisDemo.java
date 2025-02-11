import java.util.Scanner;
class This{
    static int c=0;
    public This(){
        this.c++;
    }
    public void change(int r){
        this.c = r;
    }
}
public class ThisDemo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        This c1 = new This();
        This c2 = new This();
        This c3 = new This();
        This c4 = new This();
        This c5 = new This();
        System.out.println("Total Object are = "+c1.c);
        System.out.println("Enter a number to change Value of Static Vriable");
        int r = sc.nextInt();
        c1.change(r);
        System.out.println("Value of C = "+c1.c);
    }
}