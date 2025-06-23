class pen {
    String color;
    String type;

    public pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void write() {
        System.out.println("Writing with " + type + " pen of color " + color);
    }
}
 class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
    
}
public class oops {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();
        pen p1 = new pen("blue", "ball-point");
        p1.write();
        pen p2 = new pen("red", "gel");
        p2.write();
    }
}
    