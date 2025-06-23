import java.util.Scanner;

public class naturalnumsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a number to calculate the sum of natural numbers up to that number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number from 1 to n to sum
        }
        System.out.println("\nThe sum of natural numbers up to " + n + " is: " + sum+ "\n");
        sc.close();
    }
}
