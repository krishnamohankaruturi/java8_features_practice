package org.example.java8features;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {
        String[]  strArray= {"java","springboot","microservice"};
        String longestStr = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestStr);

    }
}
