// Main.java
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();

        System.out.println("Choose an Operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci Sequence\n6. Mean of Array\n7. Variance of Array");

        int choice = userInput.getChoice();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                double a = userInput.getNumber();
                double b = userInput.getNumber();
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case 2:
                System.out.println("Enter two numbers:");
                a = userInput.getNumber();
                b = userInput.getNumber();
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case 3:
                System.out.println("Enter two numbers:");
                a = userInput.getNumber();
                b = userInput.getNumber();
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case 4:
                System.out.println("Enter two numbers:");
                a = userInput.getNumber();
                b = userInput.getNumber();
                System.out.println("Result: " + calculator.divide(a, b));
                break;
            case 5:
                System.out.println("Enter the number of terms for the Fibonacci sequence:");
                int terms = userInput.getInt();
                System.out.println("Fibonacci Sequence: " + calculator.fibonacci(terms));
                break;
            case 6:
                System.out.println("Enter the size of the array:");
                int size = userInput.getInt();
                System.out.println("Enter the array elements:");
                double[] array = userInput.getArray(size);
                System.out.println("Mean: " + calculator.mean(array));
                break;
            case 7:
                System.out.println("Enter the size of the array:");
                size = userInput.getInt();
                System.out.println("Enter the array elements:");
                array = userInput.getArray(size);
                System.out.println("Variance: " + calculator.variance(array));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
