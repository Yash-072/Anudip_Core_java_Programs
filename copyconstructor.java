public class copyconstructor {
    String name;
    int age;

    // Copy constructor
    copyconstructor(copyconstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Parameterized constructor
    copyconstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        copyconstructor original = new copyconstructor("Alice", 20);
        original.display();

        // Using the copy constructor
        copyconstructor copy = new copyconstructor(original);
        copy.display();
    }
}
