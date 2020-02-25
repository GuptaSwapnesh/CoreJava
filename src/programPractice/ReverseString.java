package programPractice;

import java.util.Iterator;

public class ReverseString {

    public static void main(String[] args) {

        String test = "Swapnesh";

        StringBuffer buffer = new StringBuffer(test);
        StringBuilder builder = new StringBuilder(test);

        // Reversing the string using custom reverse method or Iterative Method
        reverseString(test);

        // Reversing the string using reverseMethod of StringBuilder & StringBuffer
        System.out.println("Reverse String using StringBuffer method:- " + buffer.reverse());
        System.out.println("Reverse String using StringBuilder method:- " + builder.reverse());

        // Reversing the String using recursive method call
        String reverseString = reverseStringUsingRecursion(test);
        System.out.println("Reverse String using Recursive method call:- " + reverseString);
    }

    /*
     * Reversing the String using recursive method call
     * */
    private static String reverseStringUsingRecursion(String test) {

        if (test.length() < 2) {
            return test;
        }

        return reverseStringUsingRecursion(test.substring(1)) + test.charAt(0);
    }

    /*
     * Reversing the string using custom reverse method or Iterative Method
     * */
    private static void reverseString(String test) {

        if (test == null || test.isEmpty()) {
            System.out.println("String is empty!!!");
        }

        String reverse = "";
        for (int i = test.length() - 1; i >= 0; i--) {
            reverse = reverse + test.charAt(i);
        }
        System.out.println("Reverse String using custom method:- " + reverse);

    }
}
