
import java.util.Scanner;

class Square extends Shape {
    private double side;

    public Square() {
        super("Square");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of Square: ");
        this.side = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Square: " + (side * side));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Square: " + (4 * side));
    }
}

