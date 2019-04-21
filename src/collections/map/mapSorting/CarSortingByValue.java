package collections.map.mapSorting;

import java.util.*;

public class CarSortingByValue {

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

        List<Map.Entry<Car, String>> carList = new LinkedList<>(unSortedCar.entrySet());

        Collections.sort(carList, new Comparator<Map.Entry<Car, String>>() {
            @Override
            public int compare(Map.Entry<Car, String> o1, Map.Entry<Car, String> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });

        Map<Car, String> sortedCar = new LinkedHashMap<>();
        for (Map.Entry<Car, String> entry : carList){
            sortedCar.put(entry.getKey(), entry.getValue());
        }

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
