abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor Called");
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void walk(){
        System.out.println("walk with 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walk with 2 legs");
    }
}
public class AbstractionDemo{
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        Mustang m = new Mustang();
    }
}