package oops.inheritance;

class A {
    float i = 10;

    public int getValue() {
        return 20;
    }

    public void test(){
        System.out.println("In Class A");
    }
}

class B extends A {
    int i = 20;

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public void test(){
        System.out.println("In Calss B");
    }
}

public class StaticBinding {
    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.i);
        System.out.println(a.getValue());
        a.test();
    }
}
