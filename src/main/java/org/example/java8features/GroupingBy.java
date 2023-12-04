package org.example.java8features;

import org.example.entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"krishna",50000);
        Employee emp2 = new Employee(1,"ram",60000);
        Employee emp3 = new Employee(1,"ramesh",50000);
        Employee emp4= new Employee(1,"anusha",80000);
        Employee emp5= new Employee(1,"venkat",40000);
        Employee emp6= new Employee(1,"srikanth",60000);
        List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
        //System.out.println(list);
        Map<Double, List<Employee>> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getSalary));// 2 parameter groupingBY
        System.out.println("1 para     " +
                collect1);
        Map<Double, Set<Employee>> collect2= list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.toSet()));// 2 parameter groupingBY
        System.out.println("para2    "+collect2);
        Map<Double, Set<Employee>> collect3 = list.stream().collect(Collectors.groupingBy(Employee::getSalary, LinkedHashMap::new, Collectors.toSet()));// 3 parameter groupingBY
        System.out.println("para3    "+collect3);
    }
}
