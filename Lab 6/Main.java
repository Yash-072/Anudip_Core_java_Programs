// Assignment 2
   class Student {
    String name;
    int age;
    String department;

    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("Alice", 22);

        Student student3 = new Student("Bob", 25, "Mechanical");

        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
    }
}
