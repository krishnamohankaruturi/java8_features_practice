package org.example.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {
    public static void main(String[] args) {
        int[] numbers = {5,9,55,6,27,8};
        Integer integer = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(integer);

    }
}
