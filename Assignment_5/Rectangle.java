
import java.util.Scanner;

class Rectangle extends Shape {
    private double length, width;

    public Rectangle() {
        super("Rectangle");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        this.length = sc.nextDouble();
        System.out.print("Enter width: ");
        this.width = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

