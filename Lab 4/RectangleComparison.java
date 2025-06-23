//Assignment 1
import java.util.Random;

class Rectangle {

    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int calculateArea() {
        return length * width;
    }
}

public class RectangleComparison {
    public static void main(String[] args) {
        Random rand = new Random();

        // Rand.int returns an random integer between 0 to n
        Rectangle rectangle1 = new Rectangle(rand.nextInt(20) + 1, rand.nextInt(20) + 1);
        Rectangle rectangle2 = new Rectangle(rand.nextInt(20) + 1, rand.nextInt(20) + 1);

        
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

       
        System.out.println("Rectangle1: length = " + rectangle1.length + ", width = " + rectangle1.width + ", area = " + area1);
        System.out.println("Rectangle2: length = " + rectangle2.length + ", width = " + rectangle2.width + ", area = " + area2);

        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}
