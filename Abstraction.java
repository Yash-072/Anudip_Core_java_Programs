public class Abstraction {
    // Abstract class
    abstract static class Animal {
        // Abstract method (does not have a body)
        abstract void sound();
        
        // Regular method
        void sleep() {
            System.out.println("Sleeping...");
        }
    }

    // Subclass (inherited from Animal)
    static class Dog extends Animal {
        // The body of sound() is provided here
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        // Create an object of Dog
        Animal myDog = new Dog();
        
        // Call the abstract method
        myDog.sound();  // Output: Bark
        
        // Call the regular method
        myDog.sleep();  // Output: Sleeping...
    }
}
