interface A{
    final int a = 1;
    public void hello();
}



interface A1 extends A{
    final int b = 2;
    public void hellohi();
}



interface A2 extends A{
    final int c = 3;
    public void hihello();
}



interface A12 extends A1, A2{
    final int d = 4;
    public void hihellohi();
}



class B implements A12{
    public void hello(){
        System.out.println("hello       "+a);
    }
    public void hellohi(){
        System.out.println("hellohi     "+b);
    }
    public void hihello(){
        System.out.println("hihello     "+c);
    }
    public void hihellohi(){
        System.out.println("hihellohi   "+d);
    }
}



public class Intterface{
    public static void main(String[] args){
        B b = new B();
        b.hello();
        b.hellohi();
        b.hihello();
        b.hihellohi();
    }
}