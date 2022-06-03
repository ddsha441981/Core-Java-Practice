package practice.generic;

import java.util.Arrays;

public class GenericExample {

    // This is work only with NonPrimitive data type (Integer,FLoat,Long,Double,String --class)

    //This method can handle all type of request likes String Integer
    // There are no need to write another method and no need to overloading here
    public <T> void m1(T[] sValue){
        for (int i = 0; i<sValue.length; ++i){
            System.out.println("Value is " + Arrays.toString(sValue));
        }
    }


//    public  void m1(String[] sValue){
//        for (int i = 0; i<sValue.length; ++i){
//            System.out.println("Value is " + Arrays.toString(sValue));
//        }
//    }
//
//    public  void m1(Integer[] sValue){
//        for (int i = 0; i<sValue.length; ++i){
//            System.out.println("Value is " + Arrays.toString(sValue));
//        }
//    }
//

    public static void main(String[] args) {

        GenericExample genericExample = new GenericExample();
        String[] countryList = {"India","Japan","USA","Russia","Chaina","London"};
        Integer[] numberList = {1,5,7,9,7,5,4,6,9};
        genericExample.m1(countryList);
        genericExample.m1(numberList);

    }
}
