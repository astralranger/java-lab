import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public ArrayList<Integer> arrayInput() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            array.add(sc.nextInt());
        }
        return array;
    }
}
