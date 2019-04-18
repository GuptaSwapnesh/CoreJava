package oops.polymorphism;

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();

        int addIntNumbers = methodOverloading.addNumbers(5, 6);
        System.out.println("Add integers:- " + addIntNumbers);

        float addFloatNumbers = methodOverloading.addNumbers(5.5f, 5);
        System.out.println("Add float:- " + addFloatNumbers);


    }
}
