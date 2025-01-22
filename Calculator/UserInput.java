// UserInput.java
import java.util.Scanner;
import java.util.*;

public class UserInput {
    private Scanner scanner;

    // constructor to initialize the Scanner object
    public UserInput(Scanner scanner) { 
        this.scanner = scanner;
    }

    // method to get the user's choice from the menu
    public int getChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Method to get a single number from the user
    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    // Method to get an integer input from the user
    public int getInt() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public double[] getArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
