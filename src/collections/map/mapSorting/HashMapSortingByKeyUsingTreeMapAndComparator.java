package collections.map.mapSorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*HashMap Sorting by Keys Example – Using TreeMap & Comparator*/

public class HashMapSortingByKeyUsingTreeMapAndComparator {

    public static void main(String[] args) {

        Map<Integer, String> unsortedMap = UnSortedMap.getUnsortedMap();

        //Print the Elements of the Map before Sorting
        System.out.println("Elements of the HashMap before Sorting");
        printMap(unsortedMap);

        Map<Integer, String> sortedMap =
                new TreeMap<Integer, String>(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer i1, Integer i2) {
                        return i1.compareTo(i2);
                    }
                }
                );

        sortedMap.putAll(unsortedMap);

        //Print the Elements of the Map after Sorting
        System.out.println("Elements of the HashMap after Sorting");
        printMap(sortedMap);

    }

    public static void printMap(Map<Integer, String> map) {
        System.out.println("**************************************");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
        System.out.println();
    }

}
