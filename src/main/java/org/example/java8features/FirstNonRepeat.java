package org.example.java8features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        String  firstNonRepeat = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeat);

        //firstRepeating
        String  firstRepeat = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println(firstRepeat);
    }
}
