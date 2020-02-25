package onlineTest.hclWrittenTest;

public class Output1 {

    public String getName(){
        return "USA";
    }

/*    public StringBuffer getName(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("UK");
        return buffer;
    }*/

    public static void main(String[] args) {
        Output1 output1 = new Output1();
        output1.getName().toString();

    }

}
