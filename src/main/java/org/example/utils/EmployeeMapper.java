package org.example.utils;

import org.example.entities.Employee;
import org.example.entities.EmployeeDo;

public class EmployeeMapper {

    public   EmployeeDo convert(Employee emp){
        EmployeeDo employeeDo = new EmployeeDo();
        employeeDo.setId(emp.getId());
        employeeDo.setName(emp.getName());
        employeeDo.setSalary(emp.getSalary());
        return employeeDo;
    }
}
