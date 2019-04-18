package oops.polymorphism;

public class MethodOverloading {

    public int addNumbers(int a, int b){
        return a + b;
    }

    /* Not possible. Compile time polymorphism

    public double addNumbers(int a, int b){
        return a + b;
    } */

    public float addNumbers(float a, int b){
        return a + b;
    }
}
