package string;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {

        String test = "This sentence contains two words, one and two";

        Set<String> duplicateWords = checkDuplicate(test);
        System.out.println("String:- " + test);
        System.out.println("Duplicate Words:- " + duplicateWords);


    }

    private static Set<String> checkDuplicate(String test) {

        if(test == null || test.isEmpty()){
            return Collections.emptySet();
        }

        Set<String> duplicate = new HashSet<>();
        Set<String> stringSet = new HashSet<>();

        // Remove space between the words
        String[] words = test.split("\\s+");
        for (String word: words) {
            if(!stringSet.add(word)){
                duplicate.add(word);
            }
        }
        return duplicate;
    }
}
