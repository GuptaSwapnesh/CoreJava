package collections.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 6, 9, 8, 74, 2, 3, 6, 21);
        System.out.println("List elements:- " +list);

        // Using Collections.sort() for assending order
        Collections.sort(list);
        System.out.println("List elements:- " +list);

        // Using Collections.sort() with Comparator for desending order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("List elements:- " +list);

        // Using Collections.sort() with custom comparator
        Collections.sort(list, (Integer::compareTo));
        System.out.println("List elements:- " +list);

    }
}
