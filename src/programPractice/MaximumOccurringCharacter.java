package programPractice;

public class MaximumOccurringCharacter {

    public static void main(String[] args) {

        String name = "Swapnesh";
        System.out.println("String with name: " + name);

        countMaxOccuringChar(name);

    }

    private static void countMaxOccuringChar(String name) {

        int charArray[] = new int[256];
        int stringLength = name.length();

        for (int i = 0; i < stringLength; i++) {
            charArray[name.charAt(i)]++;
        }

        int maxCount = -1;
        int minCount = -1;
        char maxChar = ' ';
        char minChar = ' ';

        for (int i = 0; i < stringLength; i++) {
            if (maxCount < charArray[name.charAt(i)]) {
                maxCount = charArray[name.charAt(i)];
                maxChar = name.charAt(i);
            }

            if (minCount > charArray[name.charAt(i)] && charArray[name.charAt(i)] != 0) {
                minCount = charArray[name.charAt(i)];
                minChar = name.charAt(i);
            }
        }

        System.out.println("Max occurring character in the given string is: " + maxChar);
        System.out.println("Min occurring character in the given string is: " + minChar);


    }

}
