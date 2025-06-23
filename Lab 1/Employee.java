//Assingment 2
import java.util.Scanner;

public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public void setEmployeeDetails(int id, double ageDouble, String name, boolean status) {
        this.id = id;
        this.age = (int) ageDouble;
        this.name = name;
        this.isPermanent = status;
    }

    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Permanent: " + isPermanent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter age (e.g., 35.5): ");
        double age = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Is permanent? (true/false): ");
        boolean isPermanent = scanner.nextBoolean();

        emp.setEmployeeDetails(id, age, name, isPermanent);
        emp.displayDetails();

        System.out.println("Successfully started");
    }
}