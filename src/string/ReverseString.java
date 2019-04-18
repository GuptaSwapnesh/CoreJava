package string;

import java.util.Iterator;

public class ReverseString {

    public static void main(String[] args) {

        String test = "ola";

        StringBuffer buffer = new StringBuffer(test);
        StringBuilder builder = new StringBuilder(test);

        // Reversing the string using custom reverse method
        reveseString(test);

        // Reversing the string using reverseMethod of StringBuilder & StringBuffer
        System.out.println("Reverse String using StringBuffer method:- " + buffer.reverse());
        System.out.println("Reverse String using StringBuilder method:- " + builder.reverse());

    }

    private static void reveseString(String test) {

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
