package org.example.java8features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequentLetters {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AAAA", "BB", "AA", "CCCCCC");
        Map<String, Integer> collect = names.stream().distinct()
                .collect(Collectors.toMap(x -> x, x -> x.split("").length));
        System.out.println(collect);
    }





}
