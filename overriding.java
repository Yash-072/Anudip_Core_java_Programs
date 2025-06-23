class Animal {
    // Base class method
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    // Overriding the base class method
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
public class overriding {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog dog = new Dog();
        
        // Call the overridden method
        dog.sound();  // Output: Bark
        
        // Call the base class method
        Animal animal = new Animal();
        animal.sound();  
    }
}
