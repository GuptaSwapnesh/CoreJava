package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasic {

    public static void main(String[] args) {

        Set<String> setDemo = new HashSet<>();
        setDemo.add("Swapnesh");
        setDemo.add("Kaashvi");
        setDemo.add("Nirmal");
        setDemo.add("annnanna");
        setDemo.add(null);

        getElements(setDemo);

        setDemo.remove("annnanna");
        getElements(setDemo);
    }

    private static void getElements(Set<String> setDemo) {

        // Using Iterator
        System.out.println("");
        Iterator iterator = setDemo.iterator();
        while (iterator.hasNext()) {
            System.out.println("Elements in HashSet are:- " + iterator.next());
        }
/*
        // Using for loop
        System.out.println("");
        for (String s : setDemo) {
            System.out.println("Elements in HashSet are:- " + s);
        }

        // Using for-each
        System.out.println("");
        setDemo.forEach(System.out::println);*/
    }


}
