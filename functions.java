import java.util.Scanner;

public class functions {    
    public void print(){
        System.out.println("This is a function in Java.");
    }
    public int add() {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to add: ");
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        sc.close();
        return a + b; 
    }
    public static void main(String[] args) {
        functions f1 = new functions();
        f1.print(); 
        System.out.println("This is the main function in Java.");
        int result = f1.add(); 
        System.out.println("The sum is: " + result); 
    }
}