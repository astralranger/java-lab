import java.util.ArrayList;

public class DisplayArray {
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    public void oddEven(ArrayList<Integer> array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    public int smallestConsecutiveDifference(ArrayList<Integer> array) {
        if (array.size() < 2) {
            System.out.println("Not enough elements to compare.");
            return -1;
        }

        int smallestDiff = Math.abs(array.get(0) - array.get(1));

        for (int i = 1; i < array.size() - 1; i++) {
            int diff = Math.abs(array.get(i) - array.get(i + 1));
            if (diff < smallestDiff) {
                smallestDiff = diff;
            }
        }

        return smallestDiff;
    }
}
