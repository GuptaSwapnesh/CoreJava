package string;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {

        String name = "pot";
        String anagramName = "top";
        String notAnagramName = "tos";

        if(checkAnagramUsingArrays(name, anagramName)){
            System.out.println("String : " + name + " and " + anagramName + " is anagram to each other");
        } else {
            System.out.println("String : " + name + " and " + anagramName + " are not anagram to each other");
        }

        if(checkAnagramUsingArrays(name, notAnagramName)){
            System.out.println("String : " + name + " and " + notAnagramName + " is anagram to each other");
        } else {
            System.out.println("String : " + name + " and " + notAnagramName + " are not anagram to each other");
        }

    }

    private static boolean checkAnagramUsingArrays(String name, String anagramName) {
        char[] charName = name.toCharArray();
        char[] charAnagramName = anagramName.toCharArray();
        Arrays.sort(charName);
        Arrays.sort(charAnagramName);

        return Arrays.equals(charName, charAnagramName);
    }
}
