package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

public class SingleInheritance extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }

    public static void main(String[] args) {
        SingleInheritance d = new SingleInheritance();
        d.eat();
        d.bark();
    }
}
