package Algo;//7. Algo.Factorial Time (O(n!)):
//        - Example: Generating all permutations of a string.

public class Factorial {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length() - 1);
    }

    static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }


}
