package org.example.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return null;
    }

    public static void main(String[] args) {
//        Supplier<String> sup= new SupplierDemo();
//        System.out.println(sup.get());
        //Supplier<String> sup =() -> "Hi, How are you";
       // System.out.println(sup.get());
        List<String> list = Arrays.asList("Krishna","Mohan");
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi, How are you"));

    }
}
