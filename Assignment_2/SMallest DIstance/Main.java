public class Main {
    public static void main(String[] args) {
        // create an instance of ArrayDistanceFinder
        ArrayDistanceFinder finder = new ArrayDistanceFinder();

        // define an example array
        int[] arr = {4, 9, 6, 3, 15, 11, 2};

        // find the index of the first number in the closest pair using the findSmallestDistance method
        int index = finder.findSmallestDistance(arr);

        // print the result: index of the first number in the closest pair
        System.out.println("The index of the first number is: " + index);
    }
}
