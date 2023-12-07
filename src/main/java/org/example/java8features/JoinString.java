package org.example.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JoinString {
    public static void main(String[] args) {
        List<String> nos = Arrays.asList("1","2","3","5");
        String results = String.join("_",nos);
        String results2 = nos.stream().collect(Collectors.joining("-"));
        System.out.println(results2);
        i

         // skip and limit example
        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);
    }
}
