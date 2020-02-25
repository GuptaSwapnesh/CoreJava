package programPractice;

import java.util.ArrayList;
import java.util.List;

public class ListOfItemsContainingGivenCharacters {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("rabbit");
        list.add("bribe");
        list.add("dog");

        System.out.println("List of items: " + list);
        System.out.println("The given word is: bib ");
        System.out.println("The strings containing all the letters of the given word are: ");
        for (int i = 0; i < list.size(); i++) {
            checkExistance(list.get(i), "bib");
        }
    }

    private static void checkExistance(String word, String charsToFind) {

        int charCheck = 0;
        char chhar = ' ';
        int charArray[] = new int[256];

        for (int i = 0; i < word.length(); i++) {
            charArray[word.charAt(i)]++;
        }

        for (int j = 0; j < charsToFind.length(); j++) {
            chhar = charsToFind.charAt(j);
            if (charArray[chhar] >= 1) {
                charCheck = 1;
            }
        }

        if (charCheck == 1) {
            System.out.println(word);
        }
    }
}
