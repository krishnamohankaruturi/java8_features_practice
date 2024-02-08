package org.example.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSequence {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 9);
        Stream<Integer> numStream = list.stream()
                .filter((val) -> val >= 3)
                .peek(val -> System.out.println("after filter"+val))
                .map(val -> val * (-1))
                .peek(val -> System.out.println("after negating"+val))
                .sorted()
                .peek(val -> System.out.println("after sorted"+val));
        List<Integer> filteredStream = numStream.collect(Collectors.toList());

    }
}
