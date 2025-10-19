package Static;

public class StaticMethod {
    class MathUtil {
        static int square(int n) {
            return n * n;
        }

        public static void main(String[] args) {
            System.out.println(MathUtil.square(5));
        }
    }

}
