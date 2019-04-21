package oops.cloning;

public class CloningClass implements Cloneable {

    public int i;
    public int j;

    public CloningClass(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    /* Shallow Cloning */
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    /* Deep Cloning */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloningClass cloningClass = (CloningClass) super.clone();
        return cloningClass;
    }
}
