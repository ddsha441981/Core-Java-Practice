package practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,7,9,1,2);
        List<Integer> list1 = list.stream().filter((e) -> e > 5).collect(Collectors.toList());
        System.out.println(list1);
    }
}
