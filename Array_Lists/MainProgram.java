import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        DisplayArray displayArray = new DisplayArray();

        ArrayList<Integer> arr = userInput.arrayInput();

        displayArray.display(arr);
        displayArray.oddEven(arr);
        int smallestDiff = displayArray.smallestConsecutiveDifference(arr);

        System.out.println("Smallest consecutive difference is: " + smallestDiff);
    }
}
