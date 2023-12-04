package org.example.java8features;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class ArrayMultiply {

    public static void main(String[] args) {
        Integer[]  arr = {1,8,9,5,3};
        int result = Arrays.stream(arr).reduce((a,b) -> a *b).get();
        System.out.println(result);
    }
}
