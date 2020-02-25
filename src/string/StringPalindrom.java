package string;

public class StringPalindrom {

    public static void main(String[] args) {

        String palindrome = "abba";
        if (isPalindrome(palindrome)) {
            System.out.println("String : " + palindrome + " is a palindrome");
        } else {
            System.out.println("String : " + palindrome + " is not a palindrome");
        }

        if (usingStringBuffer(palindrome)) {
            System.out.println("String : " + palindrome + " is a palindrome");
        } else {
            System.out.println("String : " + palindrome + " is not a palindrome");
        }
    }

    private static boolean usingStringBuffer(String palindrome) {
        StringBuffer buffer = new StringBuffer(palindrome);
        buffer = buffer.reverse();
        String reverseString = buffer.toString();
        return reverseString.equals(palindrome);
    }


    private static boolean isPalindrome(String palindrome) {
        int i = 0, temp = palindrome.length() - 1;

        while (i < temp) {

            if (palindrome.charAt(i) != palindrome.charAt(temp)) {
                return false;
            }

            i++;
            temp--;
        }
        return true;
    }
}
