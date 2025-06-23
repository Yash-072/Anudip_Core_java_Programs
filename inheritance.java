public class inheritance {
    // Base class
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Derived class
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        myAnimal.sound(); // Call the method in the base class

        Dog myDog = new Dog(); // Create a Dog object
        myDog.sound(); // Call the overridden method in the derived class
    }
}
