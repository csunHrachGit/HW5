package recursionexample;

/**
 * Assignment: Recursion mini-tasks.
 *
 * Implement the methods below following the assignment handout.
 * You may add private helper methods if you like.
 */
public class RecursionExercises {

    // Task 1: recursive factorial
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        else if (n == 0) {
            return 1L;
        }
        else if (n == 1) {
            return 1L;
        }
        else if (n > 1) {
            return n * factorialRecursive(n - 1);
        }
        return 0L;
    }

    // Task 2: iterative factorial
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        else if (n == 0) {
            return 1L;
        }
        else if (n == 1) {
            return 1L;
        }
        else if (n > 1) {
            long result = 1L;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        return 0L;
    }

    // Task 3: recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        else if (n == 0) {
            return 0L;
        }
        else if (n == 1) {
            return 1L;
        }
        else if (n > 1) {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
        return 0L;
    }

    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        if (data == null) {
            throw new IllegalArgumentException("data array must not be null");
        }
        else if (data.length == 0) {
            return 0L;
        }
        else {
            return sumArrayFromIndex(data, 0);
        }
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        if (index == data.length) {
            return 0L;
        }
        else {
            return data[index] + sumArrayFromIndex(data, index + 1);
        }
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        else if (s.length() <= 1) {
            return s;
        }
        else {
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }
}
