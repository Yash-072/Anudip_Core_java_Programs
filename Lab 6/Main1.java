//Assignment 1

class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}


class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}


class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();  // Calls overridden method
        System.out.println("Vehicle serviced.");
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Garage garage = new Garage();

        System.out.println("=== Servicing Car ===");
        garage.serviceVehicle(car);

        System.out.println("=== Servicing Motorcycle ===");
        garage.serviceVehicle(motorcycle);
    }
}
