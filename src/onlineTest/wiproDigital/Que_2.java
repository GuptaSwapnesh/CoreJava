package onlineTest.wiproDigital;

/*
* Output of the following code
* */

public class Que_2 {

    public void displayMsg() {
        System.out.println("In Que_2");
    }

    public static void main(String[] args) {

        InnerQuestoin innerQuestoin = new InnerQuestoin();
        innerQuestoin.displayMsg();

        Que_2 que_2 = new InnerQuestoin();
        que_2.displayMsg();
    }

}

class InnerQuestoin extends Que_2 {
    public void displayMsg() {
        System.out.println("In InnerQuestion");
    }
}
