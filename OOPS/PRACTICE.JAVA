

class Car {
    String brand;
    int year;

    // Method to display car details
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        // Creating objects of class Car
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2022;

        Car car2 = new Car();
        car2.brand = "Tesla";
        car2.year = 2024;

        // Calling method using objects
        car1.displayInfo();
        car2.displayInfo();
    }
}
