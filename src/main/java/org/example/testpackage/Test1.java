package org.example.testpackage;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
/*        List<String> strings = Arrays.asList("hekk","hdhd","gdgdg")
        numbers.stream().sorted((a,b) -> a.compareTo(b));
        numbers.stream().sorted(Integer::toHexString);// here
        strings.stream().sorted(String::compareTo);*/
       // numbers.stream().forEach(Integer::compareTo);
        System.out.println(numbers);

    }
}
