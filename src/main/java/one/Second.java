package one;

import java.util.*;

public class Second {

    // List, Set, Map

    /**
     *
     * Why we need collections ?
     *
     *
     * Memoization ensures that a method doesn't run
     * for the same inputs more than once
     * by keeping a record of the results
     * for the given inputs (usually in a hash map).
     *
     * List<T> list = new ArrayList<>(); - LinkedList, Stack, Queue
     * Set<T> set = new HashSet<>();  -
     * Map<K,V> map = new HashMap<>();
     *
     * int - input
     * int - output
     * fib(1) - 1
     * fail fast
     */
    private static Map<Integer, Integer> fiboMap = new HashMap<>();

    private static int fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing " +
                            "as a negative index in a series.");

            // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }
        // 1 - 1
        // 2 - 1
        // 3 - 2
        // 4 - 3
        // fib(2), fib(3)
        // see if we've already calculated this
        if (fiboMap.containsKey(n)) {
            System.out.printf("grabbing fiboMap[%d]\n", n);
            return fiboMap.get(n);
        }

        System.out.printf("computing fib(%d)\n", n);
        int result = fibonacci(n - 1) + fibonacci(n - 2);

        // memoize
        fiboMap.put(n, result);
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Fib(0) : 0 => " + fibonacci(0));

        System.out.println("Fib(1) : 1 => " + fibonacci(1));

        System.out.println("Fib(2) : 1 => " + fibonacci(2));

        System.out.println("Fib(3) : 2 => " + fibonacci(3));

        System.out.println("Fib(4) : 3 => " + fibonacci(4));

        System.out.println("Fib(5) : 5 => " + fibonacci(5));

        System.out.println("Fib(6) : 8 => " + fibonacci(6));
        System.out.println("Fib(1000) : 1556111435 => " + fibonacci(1000));
    }

    public static OptionalDouble fibonacciAverage(int n) {
        fibonacci(n);
        List<Integer> values = new ArrayList<>(fiboMap.values());

        return values.stream().mapToInt(value -> value).average();
    }

}
