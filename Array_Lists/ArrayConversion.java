import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {
    public static ArrayList<Integer> arrayToList(Integer[] array) {
        if (array == null) return new ArrayList<>();
        return new ArrayList<>(Arrays.asList(array));
    }

    public static Integer[] listToArray(ArrayList<Integer> list) {
        if (list == null) return new Integer[0];
        return list.toArray(new Integer[0]);
    }
}
