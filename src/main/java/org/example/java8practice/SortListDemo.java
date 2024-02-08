package org.example.java8practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {

        List<Employee> list = DataBase.getEmployees();
        //Collections.sort(list, ( o1,  o2) -> (int) (o1.getSalary()-o2.getSalary()));
       // System.out.println(list);
       // list.stream().sorted(( o1,  o2) -> (int) (o1.getSalary()-o2.getSalary())).forEach(t -> System.out.println(t));
        list.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(t -> System.out.println(t));
        list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(t -> System.out.println(t));
    }
}
   /* class MyComparator implements Comparator<Employee>
    {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary()-o2.getSalary());
        }
    }*/

