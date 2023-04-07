package Algo;//Algo.Logarithmic Time (O(log n)):
//
//        Example: Binary search in a sorted array.


public class Logarithmic {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int key = 7;
        int index = binarySearch(arr, key);
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // key not found
    }
}
