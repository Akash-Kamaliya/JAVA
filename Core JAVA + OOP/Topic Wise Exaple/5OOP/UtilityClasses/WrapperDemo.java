public class WrapperDemo {
    public static void main(String[] args) {
        int x = 10;

        Integer obj = Integer.valueOf(x);

        int y = obj.intValue();

        System.out.println("Boxed value: " + obj);
        System.out.println("Unboxed value: " + y);
    }
}
