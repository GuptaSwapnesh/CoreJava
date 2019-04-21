package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(12, "ABC");
        System.out.println("Hash Map values:- " + map);
        System.out.println("Hash Map key HashCode:- " + map.get(12).hashCode());
        System.out.println("Hash Map Size:- " + map.size());

        map.put(2, "PQR");
        System.out.println("Hash Map values:- " + map);
        System.out.println("Hash Map key HashCode:- " + map.get(2).hashCode());
        System.out.println("Hash Map Size:- " + map.size());

        map.put(85, "MNO");
        System.out.println("Hash Map values:- " + map);
        System.out.println("Hash Map key HashCode:- " + map.get(85).hashCode());
        System.out.println("Hash Map Size:- " + map.size());

        map.put(55, "EFG");
        System.out.println("Hash Map values:- " + map);
        System.out.println("Hash Map key HashCode:- " + map.get(55).hashCode());
        System.out.println("Hash Map Size:- " + map.size());

        map.put(12, "XYZ");
        System.out.println("Hash Map values:- " + map);
        System.out.println("Hash Map key HashCode:- " + map.get(12).hashCode());
        System.out.println("Hash Map Size:- " + map.size());


    }

}
