package collections.arrayList.problemStatements;

public class SumInTheArray {

    public static void main(String[] args) {

        int array[] = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("Pair found at:- " + i + " and " + j);
                    continue;
                }
            }
        }

        System.out.println("No Pair found");
    }
}
