package org.example.java8practice.methodreference;

import java.util.function.BiFunction;

public class MethodRefObjType {
    public static void main(String[] args) {
        BiFunction<String,Integer,String> bf1 = new BiFunction<String, Integer, String>() {
            @Override
            public String apply(String s, Integer integer) {
                return  s.substring(integer);
            }
        };
        String subString1=getSubstring("krishna mohan",3,bf1);
        System.out.println(subString1);
        BiFunction<String ,Integer,String> bf2 = (s,num) -> s.substring(num);
        System.out.println(getSubstring("krishna mohan",3,bf2));
        BiFunction<String ,Integer,String> bf3 = String::substring;
        System.out.println(getSubstring("krishna mohan",3,bf3));
    }
    public static String getSubstring(String str1,int beginIndex,BiFunction<String,Integer,String> p)
    {
        return p.apply(str1, beginIndex);

    }
}
