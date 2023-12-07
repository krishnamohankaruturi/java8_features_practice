package org.example.java8features;

import org.example.entities.Employee2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByDeptSalary {

    public static void main(String[] args) {
        List<Employee2> list2 = Stream.of(
                new Employee2(1, "Basant", "Dev", 50000),
                new Employee2(2, "Tinku", "Dev", 80000),
                new Employee2(3, "Bannu", "QA", 60000),
                new Employee2(4, "Ram", "QA", 90000),
                new Employee2(5, "Anusha", "DEVOPS", 40000)
        ).collect(Collectors.toList());

        //Approach 1
        Comparator<Employee2> compareBySalary = Comparator.comparing(Employee2::getSalary);
        Map<String, Optional<Employee2>> empMap = list2.stream().collect(
                Collectors.groupingBy(
                        Employee2::getDept, Collectors.reducing(BinaryOperator.maxBy(compareBySalary))
                )
        );
        System.out.println(empMap);

        //Approach 2
        Map<String, Employee2>  empMap2 = list2.stream()
                .collect(Collectors.groupingBy(
                        Employee2::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee2::getSalary)), Optional::get)));
        System.out.println(empMap2);

    }
}
