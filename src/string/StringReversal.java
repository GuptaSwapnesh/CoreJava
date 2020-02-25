package string;

public class StringReversal {

    public static void main(String[] args) {

        String name = "ABCD";
        String reverseString = "";

        // Reversal using for-loop
        for (int i = name.length() -1; i >= 0; i--){
            reverseString = reverseString + name.charAt(i);
        }
        System.out.println(reverseString);

        // Reversal using StringBuffer or StringBuilder reverse()
        StringBuffer buffer = new StringBuffer(name);
        buffer = buffer.reverse();
        String reverseStringUsingStringBuffer = buffer.toString();

        System.out.println(reverseStringUsingStringBuffer);

    }
}
