package programPractice;


/*
 * In Fibonacci series, next number is the sum of previous two numbers.
 * The first two numbers of Fibonacci series are 0 and 1.
 *
 * The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * */

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series of 10 numbers:");

        // Using for loop
        for (int i = 0; i <= 10; i++) {
            System.out.print(first + " ");

            /*
             * On each iteration, we are assigning second number to the first number and
             * assigning the sum of last two numbers to the second number
             * */
            int sum = first + second;
            first = second;
            second = sum;
        }

        System.out.println("***************");
        System.out.println("Fibonacci Series of 10 numbers:");

        // Using while loop
        /*int k = 1;
        int firstNum = 0;
        int secondNum = 1;

        while (k <= 10) {
            System.out.print(firstNum + " ");

            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }*/

        System.out.println("***************");
        System.out.println("Fibonacci Series of 10 numbers using Recursion:");

        for (int j = 0; j <= 10; j++) {
            System.out.println(recursiveCall(j));
        }
    }

    private static int recursiveCall(int j) {
        if (j == 1 || j == 2) {
            return 1;
        }

        return recursiveCall(j - 1) + recursiveCall(j - 2);
    }
}
