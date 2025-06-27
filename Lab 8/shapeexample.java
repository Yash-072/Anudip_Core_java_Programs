//Assignment 2
class Shape {
    public void getArea() {
        System.out.println("Area method in Shape");
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Square {
    int length;

    public Square(int length) {
        this.length = length;
    }

    public void getArea() {
        int area = length * length;
        System.out.println("Square Area: " + area);
    }
}

public class shapeexample {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.getArea();

        Square s = new Square(4);
        s.getArea();
    }
}
