import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {
    // convert an array to an ArrayList
    public ArrayList<Integer> arrayToArrayList(Integer[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // convert an ArrayList back to an array
    public Integer[] arrayListToArray(ArrayList<Integer> arrayList) {
        Integer[] array = new Integer[arrayList.size()];
        return arrayList.toArray(array);
    }
}
