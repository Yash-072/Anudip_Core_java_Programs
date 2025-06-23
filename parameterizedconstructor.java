class parameterizedconstructor {
    String name;
    int age;

    // Parameterized constructor
    parameterizedconstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        parameterizedconstructor s1 = new parameterizedconstructor("Alice", 20);
        s1.display();
    }
}