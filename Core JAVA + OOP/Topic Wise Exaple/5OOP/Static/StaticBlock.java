package Static;

public class StaticBlock {
    static int x;

    static {
        x = 100;
        System.out.println("Static block executed!");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed!");
        System.out.println("x = " + x);
    }
}
