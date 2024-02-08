package org.example.java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("Consumer Interface");
        consumer.accept(5);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(t -> System.out.println(t));// forEach accepts the consumer function, and inturn it calls the accept functin


    }
}
