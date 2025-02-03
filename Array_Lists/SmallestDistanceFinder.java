public class SmallestDistanceFinder {
    public static int findSmallestDistanceIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int minIndex = 0;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
