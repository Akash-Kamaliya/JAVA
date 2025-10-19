package Inheritance;

public class Super {
    static class Animal {
        Animal() {
            System.out.println("Animal constructor");
        }

        void eat() {
            System.out.println("Animal eats food");
        }
    }

    static class Dog extends Animal {
        Dog() {
            super();
            System.out.println("Dog constructor");
        }

        void eat() {
            super.eat();
            System.out.println("Dog eats bones");
        }

    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }

}
