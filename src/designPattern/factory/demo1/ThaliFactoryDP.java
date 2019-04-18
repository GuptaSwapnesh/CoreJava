package designPattern.factory.demo1;

public class ThaliFactoryDP {

    public static void main(String[] args) {

        BaseThaliRestaurant thalirestaurant = new ThaliRestaurant();
        Thali gujaratiThali = thalirestaurant.createThali("gujarati");
        Thali punjabiThali = thalirestaurant.createThali("punjabi");


    }
}
