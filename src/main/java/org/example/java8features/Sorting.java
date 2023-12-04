package org.example.java8features;

import org.example.entities.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"krishna",50000);
        Employee emp2 = new Employee(1,"ram",60000);
        Employee emp3 = new Employee(1,"ramesh",50000);
        Employee emp4= new Employee(1,"anusha",80000);
        Employee emp5= new Employee(1,"venkat",40000);
        Employee emp6= new Employee(1,"srikanth",60000);
        List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
        List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        collect.forEach(x -> System.out.println(x.getName()));

        List<Employee> collect1 = list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.toList());
         collect1.forEach(x -> System.out.println(x.getSalary()+" <---------->"+x.getName()));
    }
}
