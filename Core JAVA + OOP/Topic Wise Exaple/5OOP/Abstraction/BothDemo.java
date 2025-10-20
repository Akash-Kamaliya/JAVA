interface Vehicle {
    void start();
}

abstract class Car implements Vehicle {
    abstract void fuelType();
}

class ElectricCar extends Car {
    void fuelType() {
        System.out.println("Electric power");
    }
    public void start() {
        System.out.println("Car started silently");
    }
}

public class BothDemo {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar();
        v.start();
        ((ElectricCar) v).fuelType();
    }
}
