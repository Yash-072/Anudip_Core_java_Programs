import java.util.Scanner;

public class arrayexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int a[];
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        a = new int[s];
        System.out.println("Enter the array elements: ");
        for (int k = 0; k < a.length; k++) {
            a[k] = sc.nextInt();
        }
        sc.close();
    }
}
