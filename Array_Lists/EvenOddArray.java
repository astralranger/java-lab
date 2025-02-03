import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArray {
    public static void processEvenOdd(Scanner scanner) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        System.out.println("Enter numbers (type '0' to stop):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0) break;
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
