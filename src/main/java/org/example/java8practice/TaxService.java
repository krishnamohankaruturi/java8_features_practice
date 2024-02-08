package org.example.java8practice;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
     public List<Employee> evaluateTaxUsers(String input) {
         return input.equalsIgnoreCase("tax")
                 ? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                 : DataBase.getEmployees().stream().filter(emp -> emp.getSalary() < 500000).collect(Collectors.toList());
     }
    public static void main(String[] args) {
        System.out.println(new TaxService().evaluateTaxUsers("non tax"));
    }
}
