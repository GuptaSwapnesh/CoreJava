package string;

public class StringPermutation {

    public static void main(String[] args) {

        String name = "abc";
        String newName = "aba";

        stringPermutation("", name);
        // stringPermutation("", newName);
    }

    // Recursive call for String Permutation
    private static void stringPermutation(String a, String b) {

        if (b.isEmpty()) {
            System.out.println(a + b);
        } else {
            for (int i = 0; i < b.length(); i++) {
                stringPermutation(a + b.charAt(i), b.substring(0, 1) + b.substring(i+1, b.length()));
            }
        }
    }
}
