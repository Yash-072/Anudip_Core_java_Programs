public class patterprint {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("* *");        
        System.out.println("* * *");    
        //by using for loop
        System.out.println("By using For Loop"); 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
