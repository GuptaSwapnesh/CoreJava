package onlineTest.optymyzeTest;

/*
 *
 *
 * */

public class CoinFlip {

    public static void main(String[] args) {
        int[] coinArray = new int[]{1, 1, 1, 1, 1, 0};
        System.out.println(coinArray);

        /*int count = adjacencies(coinArray);
        System.out.println("Count: " + count);*/

        System.out.println("*********************");
        int count3 = selfSolution(coinArray);
        System.out.println("Count-3: " + count3);
    }

    private static int selfSolution(int[] coinArray) {
        int n = coinArray.length;
        int tail = 0;
        int head = 0;

        for (int i = 0; i < n; i++) {
            if (coinArray[i] > 0) {
                head = head + 1;
            } else {
                tail = tail + 1;
            }
        }

        if (head == tail || head > tail) {
            return tail;
        } else {
            return head;
        }

    }

    /*private static int adjacencies(int[] coinArray) {
        int count = 0;
        boolean found = false;

        for (int i = 0; i < coinArray.length - 1; i++) {
            if (coinArray[i] == coinArray[i + 1]) {
                System.out.println(coinArray[i] + " " + coinArray[i + 1]);
                count++;
            } else if (((i + 2) < coinArray.length - 1) && !found) {
                if ((coinArray[i] == 0 && coinArray[i + 1] == 1 && coinArray[i + 2] == 0) || (coinArray[i] == 1 && coinArray[i + 1] == 0 && coinArray[i + 2] == 1)) {
                    found = true;
                    count = count + 2;
                } else if ((coinArray[i] == 1 && coinArray[i + 1] == 0 && coinArray[i + 2] == 0) || (coinArray[i] == 0 && coinArray[i + 1] == 1 && coinArray[i + 2] == 1)) {
                    found = true;
                    count = count + 1;
                }
            }
        }

        return count;
    }*/

}
