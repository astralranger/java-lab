
import java.util.Scanner;

class Circle extends Shape {
    private double radius;

    public Circle() {
        super("Circle");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        this.radius = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }
}

