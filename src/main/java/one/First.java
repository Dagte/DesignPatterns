package one;

public class First {

    /**
     * Problem :
     *
     * Your task is to create a method fibonacciAverage(int COUNT)
     * that returns the average of COUNT first Fibonacci numbers.
     *
     * What is fibonacci ?
     *
     * In the Fibonacci sequence of numbers, each number is the sum of
     * the previous after numbers,
     * starting with 1 and 1. This sequence begins:
     * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .....
     *
     * fib(n) = fib(n-1) + fib(n-2)
     * F(0) = 0
     * F(1) = 1 - F(1)
     * F(2) = 1 - F(1) + F(0)
     * F(3) = 2 - F(1) + F(2)
     * F(4) = 3 - F(2) + F(3)
     * F(5) = 5 - F(3) + F(4)
     *
     * inputs - outputs
     * Fibonacci class
     * psvm - main - later
     * calculate - method signature ?
     *
     *
     */

    /**
     * access modifier - private,public, default, protected
     * static - or not
     * return type - primitive types, object types, void
     * method name
     * method input arguments
     *
     * fib(n) = fib(n-1) + fib(n-2);
     */

    private static int calculateFibonacci(int n)
    {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }

        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }

    public static void main(String[] args) {

        System.out.println("Fib(-5) : ? => " + calculateFibonacci(-5));

        /*System.out.println("Fib(0) : 0 => " + calculateFibonacci(0));

        System.out.println("Fib(1) : 1 => " + calculateFibonacci(1));

        System.out.println("Fib(2) : 1 => " + calculateFibonacci(2));

        System.out.println("Fib(3) : 2 => " + calculateFibonacci(3));

        System.out.println("Fib(4) : 3 => " + calculateFibonacci(4));

        System.out.println("Fib(5) : 5 => " + calculateFibonacci(5));

        System.out.println("Fib(6) : 8 => " + calculateFibonacci(6));

        System.out.println("Fib(Integer.MAX_VALUE) : ? => " + calculateFibonacci(Integer.MAX_VALUE));
*/
        // list, set, map
        //

    }


    /*public static void main(String[] args) {

        int fib0 = fibonacci(0);

        System.out.println("fib(0) = " + fib0);

        int fib1 = fibonacci(1);
        System.out.println("fib(1) = " + fib1);

        int fib2 = fibonacci(2);
        System.out.println("fib(2) = " + fib2);
        System.out.println("Average of 2 fibonacci number is " + getAverageFibonacci(2));

        int fib5 = fibonacci(5);
        System.out.println("fib(5) = " + fib5);
        System.out.println("Average of 5 fibonacci number is " + getAverageFibonacci(5));

        int fib8 = fibonacci(8);
        System.out.println("fib(8) = " + fib8);
        System.out.println("Average of 8 fibonacci number is " + getAverageFibonacci(8));

        int fibMax = fibonacci(Integer.MAX_VALUE);
    }*/

    public static int getAverageFibonacci(int count){
        int[] arr = new int[count];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fibonacci(i+1);
            sum += arr[i];
        }
        return sum/count;
    }

    private static int fibonacci(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
