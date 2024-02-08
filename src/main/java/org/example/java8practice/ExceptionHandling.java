package org.example.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "564", "989", "xyr");
  /*      list.forEach(s -> {
            try {
                System.out.println(Integer.parseInt(s));
            } catch (Exception ex) {
                System.out.println("Exception" + ex.getMessage());
            }
        });*/
        //list.forEach(handleExceptionIfany(s -> System.out.println(Integer.parseInt(s))));
        list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));
    }

    static Consumer<String> handleExceptionIfany(Consumer<String> payload) {
        return obj -> {
            try {
                payload.accept(obj);
            } catch (Exception ex) {
                System.out.println("exception" + ex);
            }
        };
    }

    static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer, Class<ExObj> exObjectClass) {
        return obj -> {
            try {
                targetConsumer.accept(obj);
            } catch (Exception ex) {
                try {
                    ExObj cast = exObjectClass.cast(ex);
                } catch (ClassCastException ecx) {
                    System.out.println("exception "+ecx.getMessage());
                }

            }
        };
    }

}
