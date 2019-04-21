package collections.map.mapSorting;

import java.util.*;

/*HashMap Sorting by Keys Example – Using Collections.sort()*/

public class HashMapSortingByKeyUsingCollectionsSort {

    public static void main(String[] args) {

        Map<Integer, String> unsortedMap = UnSortedMap.getUnsortedMap();

        //Print the Elements of the Map before Sorting
        System.out.println("Elements of the HashMap before Sorting");
        printMap(unsortedMap);

        List<Map.Entry<Integer, String>> unsortedList = new ArrayList<>(unsortedMap.entrySet());

        Collections.sort(unsortedList, new Comparator<Map.Entry<Integer, String>>() {
                    @Override
                    public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                }
        );
        Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();

        for (Map.Entry<Integer, String> entry : unsortedList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
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
