package org.example.testpackage;

import org.example.java8features.FunInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("alpha","beta","gamma","beta");
        Map<String, Integer> map = strings
                .stream()
                .collect(Collectors
                        .toMap(Function.identity(), String::length, (i1, i2) -> i1));
        System.out.println(map);

        Map<Integer, LinkedList<String>> collect1 = strings
                .stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.toCollection(LinkedList::new)));



    }
}
