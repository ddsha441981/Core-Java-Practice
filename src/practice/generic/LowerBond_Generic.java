package practice.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LowerBond_Generic {

//    In Generic Lower bond use super keyword
//    This method can be take input Integer type only
//    Because there are not available other class after Integer
//    Integer class is subclass of Number and Number is subclass of Object class
//    Object----> Number---> Integer,Double,Float,Long
//    Object----> Number---> Integer --->No Class After
//    Here we can pass superclass of Integer(Number) but not Double class because double is not a super class of Integer

    public void tValue(List<?super Integer> list){
        System.out.println(list);
    }
    public static void main(String[] args){
        List list = Arrays.asList(1,5,2,8,89,7,3);
        LowerBond_Generic lower = new LowerBond_Generic();
        Collections.sort(list);
        lower.tValue(list);
    }
}
