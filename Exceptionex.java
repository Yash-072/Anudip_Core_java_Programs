class Demo{
    int opration (){
        int a = 10, b = 0, c = a / b;
        return c;

    }

    
}
public class Exceptionex {
    public static void main(String[] args) {
        Demo d = new Demo();
        try{
            int result = d.opration();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed."+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }   
    }
}
