package practice.generic;

import java.util.Arrays;
import java.util.List;

public class UpperBound_Generic {

//    We use extends keyword in upper bound
//    Object----> Number---> Integer,Double,Float,Long
    public double numericValues(List<?extends Number> list){
        double sum =0.0;
        for (Number i:list) {
            sum += i.doubleValue();

        }
//        System.out.println(":---------------------------: Sum is " + sum);
        return sum;
    }

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(4, 5, 9, 7, 9, 4, 1, 2, 5);
        List<Double> list2 = Arrays.asList(4.0, 20.0, 9.0, 7.0, 9.0, 4.0, 1.0, 2.0, 5.0);
        UpperBound_Generic upper = new UpperBound_Generic();
        double sum1 = upper.numericValues(list1);
        double sum2 =  upper.numericValues(list2);
        System.out.println("Integer " + sum1 +"---------------"+ " Double " + sum2);
    }
}
