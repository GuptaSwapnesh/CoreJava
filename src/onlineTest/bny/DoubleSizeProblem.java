package onlineTest.bny;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DoubleSizeProblem {

    public static void main(String[] args) {

        List<Long> longList = new ArrayList<>();
        /*longList.add(2l);
        longList.add(5l);
        longList.add(4l);
        longList.add(6l);
        longList.add(8l);
        long b = 1l;*/

        /*longList.add(1l);
        longList.add(1l);
        longList.add(1l);
        long b = 1l;*/

        longList.add(1l);
        longList.add(2l);
        longList.add(3l);
        longList.add(1l);
        longList.add(2l);
        long b = 1l;
        long c = doubleSize(longList, b);
    }

    private static long doubleSize(List<Long> longList, long b) {

        System.out.println("List having long values before sorting:- " + longList);
        longList.sort(Comparator.naturalOrder());
        System.out.println("List having long values after sorting:- " + longList);

        for (int i = 0; i < longList.size(); i++) {
            if (longList.get(i) == b) {
                b = b * 2;
            }
        }

        System.out.println("Output " + b);
        return b;
    }
}
