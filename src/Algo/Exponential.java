package Algo;//6. Algo.Exponential Time (O(2^n)):
//        - Example: Recursive Fibonacci sequence.

public class Exponential {

    public static void main(String[] args) {
        int n = 6;
        int fib = fibonacci(n);
        System.out.println(fib); // prints 8


    }
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
