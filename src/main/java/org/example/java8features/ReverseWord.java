package org.example.java8features;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Java Concept of the Day";
        String reverseString = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseString);

    }
}
