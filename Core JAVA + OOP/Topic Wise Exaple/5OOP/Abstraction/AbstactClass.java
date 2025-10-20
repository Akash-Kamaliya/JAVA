abstract class Animal {
    abstract void sound();
    void sleep() { 
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstactClass {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.sound();
        a.sleep();
    }
}
