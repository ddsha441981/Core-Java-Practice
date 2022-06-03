package practice.collection.map;

import java.util.HashMap;

public class HashTest {
    public static void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<Integer, String>();
        h1.put(1,"d");
        h1.put(2,"q");
        h1.put(3,"p");
        h1.put(4,"r");
        h1.put(5,"e");
        h1.put(null,"e");
        h1.put(2,"Null");
        System.out.println(h1);
    }

}
