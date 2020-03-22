package onlineTest.optymyzeTest;

public class AsciiArt {

    static char printChar = 'L';

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            if (i <= n - 1)
                System.out.println(printChar);

            if (i == n) {
                recursiveCall(n);
            }
        }
    }

    private static void recursiveCall(int n) {
        int i = 0;

        if(n > i){
            System.out.print(printChar);
            n = n -1;
            recursiveCall(n);
        }

    }
}
