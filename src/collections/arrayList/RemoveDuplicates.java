package collections.arrayList;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("List elements:- " + list);

        for (int i = 2; i <= 7; i++) {
            list.add(i);
        }
        System.out.println("List elements:- " + list);

        // Using remove() method
        if (list.contains(2)) {
            list.remove(new Integer(2));
        }
        System.out.println("List elements:- " + list);

        // Removing duplicates using Set
        Set<Integer> integerSet = new HashSet<>(list);
        List<Integer> integerList = new ArrayList<>(integerSet);
        System.out.println("List elements:- " + integerList);

        // Using Iterator.remove() method
        List<Integer> integerList1 = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            integerList1.add(i);
            if (list.contains(i)) {
                iterator.remove();
            }
        }
        System.out.println("List elements:- " + integerList1);

    }
}
