package org.example.utils;

import org.example.entities.Employee;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {

    public List<Employee> loadEmployeesFromDb() {
        return IntStream.rangeClosed(1, 10).mapToObj(i -> new Employee(i, "employee" + i, new Random().nextInt())).collect(Collectors.toList());
    }

}
