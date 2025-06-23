public class scannerexample {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        int sum = a + b;
        int difference = a - b;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
        scanner.close();
    }
}
