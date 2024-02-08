package org.example.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
/*    @Override
    public boolean test(Integer integer) {
        if(integer % 2 ==0){
            return  true;
        }
        else {
            return  false;
        }
    }*/

    public static void main(String[] args) {
        Predicate<Integer> predicate = (integer) -> (integer % 2 == 0);
        System.out.println(predicate.test(89));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(i -> i % 2 == 0).forEach(t -> System.out.println(t));

    }
}
