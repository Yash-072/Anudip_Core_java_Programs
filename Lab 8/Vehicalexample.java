//Assignment 1

class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}
public class Vehicalexample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 180);
        Bike myBike = new Bike("Honda", "CBR600RR", 2021, 250);

        System.out.println("Car Details:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Max Speed: " + myCar.maximumSpeed + " km/h");
        myCar.drive();

        System.out.println();

        System.out.println("Bike Details:");
        System.out.println("Make: " + myBike.make);
        System.out.println("Model: " + myBike.model);
        System.out.println("Year: " + myBike.year);
        System.out.println("Max Speed: " + myBike.maximumSpeed + " km/h");
        myBike.drive();
    }
}
