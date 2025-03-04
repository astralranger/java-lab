#!/bin/bash

# define an associative array to store class names and their corresponding code
declare -A files

files["Shape.java"]='
abstract class Shape {
    // every shape will have a name to identify it
    protected String shapeName;

    // constructor to initialize shape name
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // abstract methods to be implemented by subclasses
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
'

files["Volume.java"]='
interface Volume {
    // this method must be implemented by 3D shapes
    void calculateVolume();
}
'

files["Circle.java"]='
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
'

files["Rectangle.java"]='
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
'

files["Square.java"]='
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
'

files["Sphere.java"]='
import java.util.Scanner;

class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere() {
        super("Sphere");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Sphere: ");
        this.radius = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Surface Area of Sphere: " + (4 * Math.PI * radius * radius));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume of Sphere: " + ((4.0 / 3) * Math.PI * radius * radius * radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Sphere has no perimeter.");
    }
}
'

files["Cylinder.java"]='
import java.util.Scanner;

class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder() {
        super("Cylinder");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Cylinder: ");
        this.radius = sc.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        this.height = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Surface Area of Cylinder: " + (2 * Math.PI * radius * (radius + height)));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume of Cylinder: " + (Math.PI * radius * radius * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Cylinder Base: " + (2 * Math.PI * radius));
    }
}
'

files["EquilateralPyramid.java"]='
import java.util.Scanner;

class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    public EquilateralPyramid() {
        super("Equilateral Pyramid");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length of Pyramid: ");
        this.base = sc.nextDouble();
        System.out.print("Enter height of Pyramid: ");
        this.height = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        double baseArea = base * base;
        double lateralArea = 2 * base * Math.sqrt((base / 2) * (base / 2) + height * height);
        System.out.println("Surface Area of Pyramid: " + (baseArea + lateralArea));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume of Pyramid: " + ((1.0 / 3) * base * base * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Pyramid Base: " + (4 * base));
    }
}
'

files["ShapeCalculator.java"]='
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect a shape to calculate:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1:
                    shape = new Circle();
                    break;
                case 2:
                    shape = new Rectangle();
                    break;
                case 3:
                    shape = new Square();
                    break;
                case 4:
                    shape = new Sphere();
                    volumeShape = (Volume) shape;
                    break;
                case 5:
                    shape = new Cylinder();
                    volumeShape = (Volume) shape;
                    break;
                case 6:
                    shape = new EquilateralPyramid();
                    volumeShape = (Volume) shape;
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            if (shape != null) {
                shape.inputValues();
                shape.calculateArea();
                shape.calculatePerimeter();
            }
            if (volumeShape != null) {
                volumeShape.calculateVolume();
            }
        }
    }
}
'

# create/update files
for file in "${!files[@]}"; do
    echo "${files[$file]}" > "$file"
    echo "Updated: $file"
done

echo "All Java files are updated!"
