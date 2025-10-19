public class MethodOverloading {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(int a, int b) {
        System.out.println("Two Integers: " + a + ", " + b);
    }

    void show(String name) {
        System.out.println("String: " + name);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.show(10);
        obj.show(10, 20);
        obj.show("Akash");
    }
}
