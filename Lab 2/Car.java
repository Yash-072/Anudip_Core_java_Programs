// Assignment 1
import java.util.Scanner;

class Car {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void display() {
        System.out.println("Car Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : $" + price);
        System.out.println("-------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many cars do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Car[] cars = new Car[n];

        // Input car details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Car #" + (i+1) + ":");
            System.out.print("Make: ");
            String make = sc.nextLine();
            System.out.print("Model: ");
            String model = sc.nextLine();
            System.out.print("Year: ");
            short year = sc.nextShort();
            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // Consume newline

            cars[i] = new Car(make, model, year, price);
        }

        // Display all cars
        System.out.println("\n--- Car List ---");
        for (Car car : cars) {
            car.display();
        }

        sc.close();
    }
}
