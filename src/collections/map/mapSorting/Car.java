package collections.map.mapSorting;

public class Car {

    private String color;
    private Integer wheels;

    public Car(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public Integer getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "" + color + "-" + wheels;
    }
}
