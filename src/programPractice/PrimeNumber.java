package programPractice;

/*
 * Print Prime Number from 1 to 100
 *
 * A prime number is a number that is only divisible by 1 or itself.
 * For example, 11 is only divisible by 1 or itself.
 * Other Prime numbers 2, 3, 5, 7, 11, 13, 17....
 *
 * Note: 0 and 1 are not prime numbers. 2 is the only even prime number.
 * */

public class PrimeNumber {

    public static void main(String[] args) {

        String primeNumbers = "";

        for (int i = 2; i <= 100; i++) {
            if (checkIfNumberIsPrime(i)) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("Prime numbers from 1 to 100 are: " + primeNumbers);

        // Check the given number is prime or not
        int number = 15;
        if (checkIfNumberIsPrime(number)) {
            System.out.printf("\nNumber %d is prime number", number);
        } else {
            System.out.printf("\nNumber %d is not prime number", number);
        }
    }

    /*
     * Method to print Prime number from 1 to 100
     * Or can be used to find the given number is Prime or not
     * */
    private static boolean checkIfNumberIsPrime(int numberToCheck) {

        int reminder = 0;

        for (int i = 2; i <= numberToCheck / 2; i++) {
            reminder = numberToCheck % i;

            /* If remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop */
            if (reminder == 0) {
                return false;
            }
        }
        return true;
    }
}
