package org.example.java8practice.methodreference;

import org.example.collections.ArrayList1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodRefConstructor {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Avin");
        al.add("krishna");
        al.add("swathi");
        al.add("Mahira");
        al.add("krishna");
        Function<List<String>, Set<String>> f1 = new Function<List<String>, Set<String>>() {
            @Override
            public Set<String> apply(List<String> nameList) {
                return  new HashSet<>(nameList);
            }
        };
        Set<String> set2 = f1.apply(al);
        System.out.println(set2);
        Function<List<String>, Set<String>> f2 = (list) -> new HashSet<>(list);
        System.out.println(f2.apply(al));
        Function<List<String>, Set<String>> f3 =HashSet::new;
        System.out.println(f3.apply(al));






    }
}
