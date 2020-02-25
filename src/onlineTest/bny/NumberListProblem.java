package onlineTest.bny;

import java.util.ArrayList;
import java.util.List;

public class NumberListProblem {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(5);
        integerList.add(30);
        integerList.add(4);
        integerList.add(20);
        integerList.add(60);

        updateList(integerList);

    }

    private static void updateList(List<Integer> list) {

        System.out.println("List items:- " +list);
        /*for (int i = 0; i < list.size(); i++) {
            if (i == 0) {

            } else if(list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1)) {
                list.remove(i);
                updateList(list);
            }
        }*/

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1)) {
                list.remove(i);
                updateList(list);
            }
        }

        System.out.println("Updated list items:- " +list);
    }
}
