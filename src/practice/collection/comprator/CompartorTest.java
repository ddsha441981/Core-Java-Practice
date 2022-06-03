package practice.collection.comprator;

import java.util.*;

class Sorting implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.charAt(o1.length()-1)>o2.charAt(o2.length()-1)){ // sorting according to last digit
            return 1;
        }return -1;
    }

}

public class CompartorTest {
    public static void main(String[] args) {
        List element = new ArrayList();
        element.add("af");
        element.add("ed");
        element.add("yd");
        element.add("df");
        element.add("ab");

        List<String> list2 = Arrays.asList("A55,E2", "U0", "T1");

        Comparator<String> comp = new Sorting();
        Collections.sort(list2,comp);
        System.out.println("----------------------------------------------------------");
        System.out.println(list2);

        Comparator<String> comp1 = new Sorting();
        Collections.sort(element,comp1);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(element);




    }


}
