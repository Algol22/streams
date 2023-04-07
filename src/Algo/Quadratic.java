package Algo;//Algo.Quadratic Time (O(n^2)):
//
//        Example: Bubble sort.

public class Quadratic {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
            }
}
