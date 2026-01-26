public class TestLowerBound {
    public static int lowerBound(int[] array, int target) {
        int low = 0;
        int high = array.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6, 8};
        int target = 4;

        int lb = lowerBound(arr, target);
        System.out.println("Lower bound of " + target + " is at index: " + lb);
    }
}