interface Animal {
    void sound(); 
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class interfaceexample {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.sound(); // 
        Dog d1 = new Dog();
        d1.sound(); 
    }
}   