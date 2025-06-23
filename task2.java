import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter button number(1,2,3): ");
        int in=sc.nextInt();        
        if (in==1) {
            System.out.println("Hello");
        } else if (in==2) {
            System.out.println("Namaste");
        } else if (in==3) {
            System.out.println("Goof Morning");
        } else {
            System.out.println("Bonjour");
        }
        sc.close();
    }
}
