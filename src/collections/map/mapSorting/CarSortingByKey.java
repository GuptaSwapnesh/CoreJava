package collections.map.mapSorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CarSortingByKey {

    public static void main(String[] args) {

        Car blueCar = new Car("Blue", 2);
        Car redCar = new Car("Red", 8);
        Car greyCar = new Car("Grey", 3);
        Car blackCar = new Car("Black", 1);
        Car yellowCar = new Car("Yellow", 5);

        Map<Car, String> unSortedCar = new HashMap<>();
        unSortedCar.put(blueCar, "Blue Car");
        unSortedCar.put(redCar, "Red Car");
        unSortedCar.put(greyCar, "Grey Car");
        unSortedCar.put(blackCar, "Black Car");
        unSortedCar.put(yellowCar, "Yellow Car");

        //Print the Elements of the Map before Sorting
        System.out.println("Elements of the HashMap before Sorting");
        printMap(unSortedCar);

        Map<Car, String> sortedCar = new TreeMap<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getWheels().compareTo(o2.getWheels());
            }
        });

        sortedCar.putAll(unSortedCar);

        //Print the Elements of the Map after Sorting
        System.out.println("Elements of the HashMap after Sorting");
        printMap(sortedCar);

    }

    private static void printMap(Map<Car, String> unSortedCar) {
        System.out.println("*************************");
        for (Map.Entry<Car, String> entry : unSortedCar.entrySet()) {
            System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());
        }
        System.out.println();
    }

}
