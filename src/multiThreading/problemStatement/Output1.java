package multiThreading.problemStatement;


/*
 * Refer: https://javarevisited.blogspot.com/2014/09/common-java-multi-threading-mistakes-1-run-vs-start.html
 * */

public class Output1 {

    public static synchronized void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                abc();
            }
        };

        thread.run();
        System.out.println("Hello!!!");
    }

    private static synchronized void abc() {
        System.out.println("Hiii!!!");
    }

}
