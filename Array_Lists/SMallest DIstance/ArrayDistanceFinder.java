public class ArrayDistanceFinder {
    public int findSmallestDistance(int[] arr) {
        if (arr.length < 2) {
            return -1;  // Not enough elements to compare
        }

        int minDiff = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
