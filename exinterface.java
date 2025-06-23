public class exinterface {
    // Interface
    interface Animal {
        // Abstract method (does not have a body)
        void sound();
        
        // Default method
        default void sleep() {
            System.out.println("Sleeping...");
        }
    }

    // Class implementing the interface
    static class Dog implements Animal {
        // The body of sound() is provided here
        @Override
        public void sound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        // Create an object of Dog
        Animal myDog = new Dog();
        
        // Call the method from the interface
        myDog.sound();  // Output: Bark
        
        // Call the default method from the interface
        myDog.sleep();  // Output: Sleeping...
    }
}
