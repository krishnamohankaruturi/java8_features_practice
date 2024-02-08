package org.example.java8practice;

interface FuncInterface {
    int sum(int a, int b);
}

public class FuncInterfaceImpl {
    public static void main(String[] args) {
        FuncInterface fun = (a, b) -> a + b;
        System.out.println(fun.sum(1, 55));

        FuncInterface fun2 = (a, b) -> {
            if (a < 0 && b < 0)
                throw new RuntimeException("message");
            else
                return a + b;
        };
        System.out.println(fun2.sum(1,99));

    }
}
