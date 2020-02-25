package string;

public class FirstLastCharInString {

    public static void main(String[] args) {

        String name = "Swapnesh";

        // Get first and last char from the string
        System.out.println("First char:- " + name.charAt(0));
        System.out.println("Last char:- " + name.charAt(name.length() - 1));

        // Remove first and last char from the string using subString()
        System.out.println("Removing first char:- " + name.substring(1));
        System.out.println("Removing last char:- " + name.substring(0, name.length() - 1));

        // Remove any char from the string
        String str = "Hello World!";
        System.out.println("Removing o from the string:- " + str.replace("o", ""));

        // Removing middle char from the string
        String str1 = "Hello World!";
        char middleElement = str1.charAt(str.length() / 2);
        System.out.println("Removing o from the string:- " + str.replace(middleElement, ' '));

    }
}
