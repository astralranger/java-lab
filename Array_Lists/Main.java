import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Even-Odd Segregation
        EvenOddArray.processEvenOdd(scanner);

        // 2. Find Smallest Distance Pair
        int[] arr = {3, 8, 15, 17, 9, 4};
        int index = SmallestDistanceFinder.findSmallestDistanceIndex(arr);
        System.out.println("Index of first number in smallest distance pair: " + index);

        // 3. Array to ArrayList and vice versa
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = ArrayConversion.arrayToList(array);
        System.out.println("Converted ArrayList: " + arrayList);
        Integer[] newArray = ArrayConversion.listToArray(arrayList);
        System.out.println("Converted Array: " + Arrays.toString(newArray));

        scanner.close(); // Close scanner to prevent 
    }
}
