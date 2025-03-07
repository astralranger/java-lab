// Piyush Gawade
// 23070126090
// B1


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

