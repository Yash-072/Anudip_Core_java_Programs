import java.util.Scanner;

public class Arraysearch {
    public static void main(String[] args) {
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        a = new int[s];
        for(int i=0;i<s;i++){
            System.out.println("Enter the array elements "+i+": ");
            a[i] = sc.nextInt();
        }
        System.out.println("************************************");
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i=0; i<a.length; i++) {
            if(a[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        
        if(!found) {   
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found in the array.");
        }
        sc.close();
    }
}
