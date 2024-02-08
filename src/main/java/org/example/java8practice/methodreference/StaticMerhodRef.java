package org.example.java8practice.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StaticMerhodRef {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(new Integer[] {1,2,3,4,5});
        Function<Integer,Integer> fun1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return PowerFunctions.power(integer);
            }
        };
        List<Integer> calculatePowForList = PowerFunctions.calculatePowOf2ForList(list,fun1);
        System.out.println(calculatePowForList);
        //using Lambd exp
        Function<Integer,Integer> fun2 = integer ->  PowerFunctions.power(integer);
        List<Integer> calculatepowforList2= PowerFunctions.calculatePowOf2ForList(list,fun2);
        System.out.println(calculatepowforList2);
        //Using method ref
        Function<Integer,Integer> fun3 = PowerFunctions::power;
        List<Integer> calculatepowforList3= PowerFunctions.calculatePowOf2ForList(list,fun2);
        System.out.println(calculatepowforList3);














    }

}
