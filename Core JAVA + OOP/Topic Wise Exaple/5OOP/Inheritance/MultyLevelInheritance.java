package Inheritance;

public class MultyLevelInheritance {
    static class Animal {
        void eat() {
            System.out.println("Animals can eat");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog can bark");
        }
    }

    static class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy is crying");
        }
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark(); 
        p.weep();
    }
}
