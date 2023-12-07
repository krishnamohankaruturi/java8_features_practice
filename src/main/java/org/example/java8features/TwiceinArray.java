package org.example.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwiceinArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean b = IntStream.of(nums)
                .distinct()
                .count() < nums.length;
        System.out.println(b);

        //ddddddddddddddddddddd
/*        Arrays.asList(nums).stream()
                .filter(i -> Collections.frequency(nums,i)  > 1)
                .count() < nums.length*/

    }
}
