package org.example.java8practice.methodreference;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodRef {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(new Integer[] {25,43,52,31,81});
        Function<Integer, Double> f1 = (num) -> Math.sqrt(num);
        List<Double> collect = list.stream().map(f1).collect(Collectors.toList());
        System.out.println(collect);
        Function<Integer, Double> f2 = Math::sqrt;
        List<Double> collect2 = list.stream().map(f1). collect(Collectors.toList());
        System.out.println(collect2);



    }
}
