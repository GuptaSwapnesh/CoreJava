package string.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final HashMap<String, String> test;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTest() {
        return (HashMap<String, String>) test.clone();
    }

    // Shallow Copy
    /*public ImmutableClass(int id, String name, HashMap<String, String> test) {
        this.id = id;
        this.name = name;
        this.test = test;
    }*/

    // Deep Copy
    public ImmutableClass(int id, String name, HashMap<String, String> test) {
        this.id = id;
        this.name = name;

        HashMap<String, String> hashMap = new HashMap<>();
        String key;
        Iterator<String> it = test.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            hashMap.put(key, test.get(key));
        }
        this.test = hashMap;
    }

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";
        int i = 10;

        ImmutableClass ce = new ImmutableClass(i, s, h1);

        //Lets see whether its copy by field or reference
        System.out.println(s == ce.getName());
        System.out.println(h1 == ce.getTest());
        //print the ce values
        System.out.println("ce id:" + ce.getId());
        System.out.println("ce name:" + ce.getName());
        System.out.println("ce testMap:" + ce.getTest());
        //change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("ce id after local variable change:" + ce.getId());
        System.out.println("ce name after local variable change:" + ce.getName());
        System.out.println("ce testMap after local variable change:" + ce.getTest());

        HashMap<String, String> hmTest = ce.getTest();
        hmTest.put("4", "new");

        System.out.println("ce testMap after changing variable from accessor methods:" + ce.getTest());

    }

}
