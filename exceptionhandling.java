class Innerexceptionhandling {
void method1() {
    try {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught an exception: " + e.getMessage());
    }
    }
    
}

public class exceptionhandling {
    public static void main(String[] args) {
      Innerexceptionhandling obj = new Innerexceptionhandling();
        obj.method1();
        
         
    }
}
