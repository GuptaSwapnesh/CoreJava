package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* ArrayList instance is shared among three threads and each thread is trying to insert ten elements in the ArrayList.
* Expected output of the example is: Size of ArrayList should be 30 and on looping the list I should get values 0..9 three times.
* */

public class ArrayListSynchronizationProblem implements Runnable {

    private List<Integer> numList;

    //Constructor
    public ArrayListSynchronizationProblem(List<Integer> numList) {
        this.numList = numList;
    }

    @Override
    public void run() {
        System.out.println("in run method");
        for (int i = 0; i < 10; i++) {
            numList.add(i);
            try {
                // introducing some delay
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // List<Integer> numList = new ArrayList<>();
        List<Integer> numList = Collections.synchronizedList(new ArrayList<>());

        // Creating three threads
        Thread t1 = new Thread(new ArrayListSynchronizationProblem(numList));
        Thread t2 = new Thread(new ArrayListSynchronizationProblem(numList));
        Thread t3 = new Thread(new ArrayListSynchronizationProblem(numList));
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Size of list is " + numList.size());
        for (Integer i : numList) {
            System.out.println("num - " + i);
        }
    }
}
