package Algo;//Algo.Linear Time (O(n)):
//
//        Example: Finding the maximum element in an array.

public class Linear {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max); // prints 9

    }
}
