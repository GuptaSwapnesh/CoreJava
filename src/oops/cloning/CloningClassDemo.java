package oops.cloning;

public class CloningClassDemo {

    public static void main(String[] args) {

        CloningClass cloningClass = new CloningClass(5, 6);
        CloningClass cloningClass1 = null;

        try {
            cloningClass1 = (CloningClass) cloningClass.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(cloningClass1.getI());
        System.out.println(cloningClass1.getJ());

        cloningClass1.setI(10);
        cloningClass1.setJ(20);

        System.out.println(cloningClass.getI());
        System.out.println(cloningClass.getJ());

    }
}
