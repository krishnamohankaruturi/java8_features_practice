package org.example.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith1 {
    public static void main(String[] args) {
        int[] numbers = {5,9,11,44,1,100,400,45};
        List<String> strList = Arrays.stream(numbers).boxed().map(x -> x.toString())
                .filter(x -> x.startsWith("4"))
                .collect(Collectors.toList());
        System.out.println(strList);

    }
}
