
abstract class Vehicle {
    // Abstract method (no body)
    abstract void startEngine();

    // Regular method
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Bike extends Vehicle {
    // Providing implementation for the abstract method
    @Override
    void startEngine() {
        System.out.println("Bike engine started with a push button.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.startEngine(); // Executes implementation in Bike
        myBike.stopEngine();  // Executes base method from Vehicle
    }
}
