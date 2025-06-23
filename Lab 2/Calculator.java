//Assignment 2
import java.util.Scanner;

class Calculator {
    // First add() method: two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Second add() method: three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Third add() method: two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Using first add() method
        System.out.println("Enter two integers to add:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum1 = calc.add(x, y);
        System.out.println("Sum of two integers: " + sum1);

        // Using second add() method
        System.out.println("\nEnter three integers to add:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum2 = calc.add(a, b, c);
        System.out.println("Sum of three integers: " + sum2);

        // Using third add() method
        System.out.println("\nEnter two double values to add:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double sum3 = calc.add(d1, d2);
        System.out.println("Sum of two doubles: " + sum3);

        sc.close();
    }
}
