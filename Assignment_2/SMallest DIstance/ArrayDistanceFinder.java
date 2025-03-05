public class ArrayDistanceFinder {
    // method to find the index of the pair with the smallest distance
    public int findSmallestDistance(int[] arr) {
        if (arr.length < 2) {
            return -1;  // not enough elements to compare
        }

        int minDiff = Integer.MAX_VALUE;  // start with the maximum possible distance
        int minIndex = -1;  // variable to store the index of the smallest distance pair

        // loop through the array and find the pair with the smallest distance
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);  // calculate the absolute difference between adjacent elements
            if (diff < minDiff) {  // check if this difference is smaller than the current smallest difference
                minDiff = diff;  // update minDiff to the new smaller value
                minIndex = i;  // update the index to the current pair
            }
        }

        return minIndex;  // return the index of the pair with the smallest distance
    }
}
