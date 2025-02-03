import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create an instance of ArrayConversion
        ArrayConversion converter = new ArrayConversion();

        // define an array
        Integer[] array = {1, 6, 9, 3, 7, 0};

        // convert array to ArrayList
        ArrayList<Integer> arrayList = converter.arrayToArrayList(array);
        System.out.println("Array to ArrayList: " + arrayList);

        // convert ArrayList back to array
        Integer[] newArray = converter.arrayListToArray(arrayList);
        System.out.println("ArrayList to Array: " + Arrays.toString(newArray));
    }
}
