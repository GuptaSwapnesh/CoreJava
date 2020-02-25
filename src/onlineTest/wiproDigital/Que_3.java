package onlineTest.wiproDigital;

public class Que_3 {

    int count;

    Que_3(int newCount) {
        newCount = count + 1;
    }

    Que_3(Que_3 que3) {
        count = que3.count + 1;
    }

    Que_3(float fCount) {
        count = (int) fCount;
    }

    void Que_3(int count) {
        count = count;
    }

    public static void main(String[] args) {

        Que_3 que_3 = new Que_3(3);
        Que_3 que2 = new Que_3(que_3);
        Que_3 que3 = new Que_3(3.3F);
        Que_3 que4 = new Que_3(3);


    }
}
