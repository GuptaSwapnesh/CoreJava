package string;

public class StringConcatenation {

    public static void main(String[] args) {

        String firstname = "Virat";
        String lastname = "Kohli";

        // 1st way - Use + operator to concatenate String
        String name = firstname + " " + lastname;
        System.out.println(name);

        // 2nd way - by using StringBuilder
        StringBuilder sb = new StringBuilder(14);
        sb.append(firstname).append(" ").append(lastname);
        System.out.println(sb.toString());

        // 3rd way - by using StringBuffer
        StringBuffer sBuffer = new StringBuffer(15);
        sBuffer.append(firstname).append(" ").append(lastname);
        System.out.println(sBuffer.toString());


        String strTest = "100";

        //Convert the String to Integer using Integer.valueOf
        Integer valueOfTest = Integer.valueOf(strTest);
        int parseIntTest = Integer.parseInt(strTest);

        System.out.println("Actual String:"+ strTest);
        System.out.println("Converted to Int:" + valueOfTest);
        System.out.println("Converted to Int:" + parseIntTest);


    }
}
