package oops.staticKeyword;

public class Testing extends MethodOverridding {

    @Override
    public int addNum(int a, int b) {
        System.out.println("Add method called from Testing class ");
        return a + b;
    }

    public static int addNumStatic(int a, int b) {
        System.out.println("Static method called from Testing class ");
        return a + b;
    }

    public static void main(String[] args) {

        Testing testing = new Testing();
        testing.addNum(5, 6);
        Testing.addNumStatic(5, 5);

        MethodOverridding methodOverridding = new Testing();
        methodOverridding.addNum(6,6);
        MethodOverridding.addNumStatic(5,3);

    }
}
