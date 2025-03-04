import java.util.Scanner;
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // display menu options
            System.out.println("\nSelect Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    Circle circle = new Circle(scanner.nextDouble());
                    circle.calculateArea();
                    circle.calculatePerimeter();
                    break;
                case 2:
                    System.out.print("Enter length and width: ");
                    Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                    rectangle.calculateArea();
                    rectangle.calculatePerimeter();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
