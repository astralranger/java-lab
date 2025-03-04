// Shape.java
abstract class Shape {
    String shape;

    // constructor to initialize the shape name
    public Shape(String shape) {
        this.shape = shape;
    }

    // abstract methods for area and perimeter, must be implemented by subclasses
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

// Volume.java (Interface)
interface Volume {
    // method to calculate volume, must be implemented by 3D shapes
    void calculateVolume();
}

// Circle.java
import java.util.Scanner;
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * Math.PI * radius));
    }
}

// Rectangle.java
class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

// Square.java
class Square extends Shape {
    double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + (side * side));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (4 * side));
    }
}

// Sphere.java
class Sphere extends Shape implements Volume {
    double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Surface Area: " + (4 * Math.PI * radius * radius));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("a sphere does not have a perimeter.");
    }
}

// Cylinder.java
class Cylinder extends Shape implements Volume {
    double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Surface Area: " + (2 * Math.PI * radius * (radius + height)));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + (Math.PI * radius * radius * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("a cylinder does not have a perimeter.");
    }
}

// EquilateralPyramid.java
class EquilateralPyramid extends Shape implements Volume {
    double baseSide, height;

    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralArea = 2 * baseSide * slantHeight;
        System.out.println("Surface Area: " + (baseArea + lateralArea));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + ((1.0 / 3.0) * (baseSide * baseSide) * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (4 * baseSide));
    }
}

// ShapeCalculator.java (Main Program)
import java.util.Scanner;
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // display the menu
            System.out.println("\nSelect Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    new Circle(scanner.nextDouble()).calculateArea();
                    break;
                case 2:
                    System.out.print("Enter length and width: ");
                    new Rectangle(scanner.nextDouble(), scanner.nextDouble()).calculateArea();
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    new Square(scanner.nextDouble()).calculateArea();
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    Sphere sphere = new Sphere(scanner.nextDouble());
                    sphere.calculateArea();
                    sphere.calculateVolume();
                    break;
                case 5:
                    System.out.print("Enter radius and height: ");
                    Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
                    cylinder.calculateArea();
                    cylinder.calculateVolume();
                    break;
                case 6:
                    System.out.print("Enter base side and height: ");
                    EquilateralPyramid pyramid = new EquilateralPyramid(scanner.nextDouble(), scanner.nextDouble());
                    pyramid.calculateArea();
                    pyramid.calculateVolume();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
