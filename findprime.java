import java.util.Scanner;

public class findprime {
    public void isprime(){
        int n, i, m = 0, flag = 0;
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        n = sc.nextInt();
        m = n / 2;
        
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number.");
            }
        }   
    }
    public static void main(String[] args) {
        findprime fp = new findprime();
        fp.isprime();
    }
}
