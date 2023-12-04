package org.example.java8features;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
        NthHighestSalary.getNthHighestSalary(4);
    }

    public static void getNthHighestSalary(int n) {
        Map<String, Integer> map = new HashMap<>();
        map.put("anil", 10000);
        map.put("hari", 20000);
        map.put("ahmed", 15000);
        map.put("shreya", 17000);
        map.put("krishna", 16000);
        map.put("ramesh",16000);
        map.put("satish",10000);
        map.put("varun",15000);
       Integer nthHighestSalary = map.entrySet().stream().map(x -> x.getValue())
               .sorted(Comparator.reverseOrder()).skip(n-1)
               .findFirst().get();
       System.out.println(nthHighestSalary);

       //both map and key
       Map.Entry<String,Integer> results =  map.entrySet().stream()
               .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
               .collect(Collectors.toList())
               .get(n-1);
       System.out.println("Both Key and Value"+  results);

       ///$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

        Map.Entry<Integer, List<String>>  salaryResult = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(n-1);
        System.out.println(salaryResult);

    }
}
