package Static;

public class StaticNested {
    class Outer {
        static int data = 10;

        static class Inner {
            void msg() {
                System.out.println("Data: " + data);
            }
        }

        public static void main(String[] args) {
            Outer.Inner obj = new Outer.Inner();
            obj.msg();
        }
    }

}