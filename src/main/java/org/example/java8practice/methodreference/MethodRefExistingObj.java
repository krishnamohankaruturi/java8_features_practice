package org.example.java8practice.methodreference;

import java.util.concurrent.CompletionService;
import java.util.function.Consumer;

public class MethodRefExistingObj {
    public static void main(String[] args) {
        Country c = new Country("India");
        Consumer<Long> pop1 = new Consumer<Long>() {
            @Override
            public void accept(Long aLong) {
                c.setPopulation(aLong);
            }
        };
        pop1.accept(20000L);
        System.out.println(c);
        Consumer<Long> pop2 = (t) -> c.setPopulation(t);
        pop2.accept(60000L);
        System.out.println(c);
        Consumer<Long> pop3 = c::setPopulation;
        pop3.accept(80000L);
        System.out.println(c);
    }
}
