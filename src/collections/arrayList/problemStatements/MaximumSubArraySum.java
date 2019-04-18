package collections.arrayList.problemStatements;

/*
 * Given an array of unordered positive and negative integers. Find the maximum sub array sum in the array.
 * */


public class MaximumSubArraySum {

    public static void main(String[] args) {

        int[] arr = {2, -9, 5, 1, -4, 6, 0, -7, 8};
        System.out.println("Sum of SubArray:- " + maxSubArraySum(arr));

        int[] input1 = {1, 5, -9, 6, -3, 4, -7};
        System.out.println("Maximum subarray sum is " + maxSubArraySum(input1));

        int[] input2 = {-9, -4, -7};
        System.out.println("Maximum subarray sum is " + maxSubArraySum(input2));

    }

    private static int maxSubArraySum(int[] input) {

        int currentSum = 0;
        int maxSum = 0;
        boolean isAllNegative = true;
        int minNegative = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            // adding array elements one by one
            currentSum += input[i];

            // replace currentSum with 0 when it becomes
            // less that 0
            if (currentSum < 0) {
                currentSum = 0;
            }
            // replace maximum sum when current sum is greater
            // means we have a new subarray with greater sum
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
            // making isAllNegative to false when ever we get a
            // positive number in the array
            if (input[i] > 0) {
                isAllNegative = false;
            }
            // track the minimum negative number in the array
            // when all array numbers are negative
            if (input[i] < 0 && input[i] > minNegative && isAllNegative) {
                minNegative = input[i];
            }
        }
        return isAllNegative ? minNegative : maxSum;

    }


}
