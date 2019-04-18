package collections.arrayList.problemStatements;

public class MissingNumberInArrayList {

    public static void main(String[] args) {

        int a[] = {1, 2, 4, 5, 6};
        System.out.println(getMissingNo(a));

    }

    private static int getMissingNo(int[] a) {
        int sum = 0;
        int arrayLength = a.length;
        for (int i = 0; i < arrayLength; i++) {
            sum += a[i];
        }

        // int total = arrayLength * (arrayLength + 1) / 2;
        int total = (arrayLength + 1) * arrayLength / 2;
        return total - sum;
    }

}
