package org.example.java8practice;

import java.util.*;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,8,7,9);
        int sum=0;
        for(int n: nums)
            sum=sum+n;
        System.out.println(sum);
        int sum1 = nums.stream().mapToInt(i ->i).sum();
        System.out.println(sum1);
        Integer reduce = nums.stream().reduce(1, (a, b) -> a + b);
        System.out.println(reduce);
        Optional<Integer> reduce1 = nums.stream().reduce(Integer::sum);
        System.out.println(reduce1.get());
        Integer reduce2 = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce2);
        Integer reduce3 = nums.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(reduce3);
        Integer reduce4 = nums.stream().reduce(Integer::max).get();
        System.out.println(reduce4);
        Double avgSalary = EmployeeDatabase.getEmployees().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(avgSalary);
        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumSalary);


    }
}
