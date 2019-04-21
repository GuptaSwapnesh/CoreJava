package oops.staticKeyword;

public class MethodOverridding {

    public int addNum(int a, int b) {
        System.out.println("Add method called from MethodOverridding class ");
        return a + b;
    }

    public static int addNumStatic(int a, int b) {
        System.out.println("Static method called from MethodOverridding class ");
        return a + b;
    }

}
