package oops.polymorphism;

public class MethodOverriddingDemo extends MethodOverridding {

    int speed = 120;

    public void run() {
        System.out.println("Handbike is running");
    }

    public static void main(String[] args) {

        MethodOverridding methodOverridding = new MethodOverridding();
        methodOverridding.run();
        System.out.println("Speed:- " + methodOverridding.speed);

        MethodOverridding overridding = new MethodOverriddingDemo();
        overridding.run();
        System.out.println("Overridden Speed:- " + overridding.speed);

    }
}
