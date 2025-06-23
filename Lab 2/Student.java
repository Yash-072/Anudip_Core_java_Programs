// Assignment 3
public class Student {
    
    private String name;
    private int age;
    private String department;

    
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

   
    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

  
    public void setAge(int age) {
        this.age = age;
    }

 
    public String getDepartment() {
        return department;
    }

  
    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 20, "Computer Science");

        System.out.println("Student Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Department: " + student1.getDepartment());

        student1.setName("Bob");
        student1.setAge(22);
        student1.setDepartment("Mechanical Engineering");

        System.out.println("\nUpdated Student Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Department: " + student1.getDepartment());
    }
}
