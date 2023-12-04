package org.example.java8features;

import org.example.entities.Employee;
import org.example.entities.EmployeeDo;
import org.example.utils.EmployeeManager;
import org.example.utils.EmployeeMapper;
import org.example.utils.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodRef {


    public static void main(String[] args) {

      /*  // anonymous method
        new EmployeeService().loadEmployeesFromDb()
                .stream()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        System.out.println(employee);
                    }
                });
        //Lambda approch
        new EmployeeService().loadEmployeesFromDb()
                .stream()
                .forEach((employee) -> System.out.println(employee));

        //MethodREf with custom type
        new EmployeeService().loadEmployeesFromDb()
                .stream()
                .forEach(MethodRef::print);

        //Method ref  with predefined class
        new EmployeeService().loadEmployeesFromDb()
                .stream()
                .forEach(System.out::println);*/



      EmployeeMapper mapper = new EmployeeMapper();
        List<EmployeeDo> employeeDos =  new EmployeeService().loadEmployeesFromDb()
                .stream()
                .map(mapper::convert).collect(Collectors.toList());// instance method ref
               System.out.println(employeeDos);

               List<String > nameList = new EmployeeService().loadEmployeesFromDb()
                       .stream()
                       .map(Employee::getName)
                       .collect(Collectors.toList());
               System.out.println(nameList);

               //lambda
        EmployeeManager manager = () -> new Employee();
        manager.getEmployee();

        EmployeeManager manager1= Employee::new;
        manager1.getEmployee().getEmployeeInfo();


           new EmployeeService().loadEmployeesFromDb()
                .stream()
                .map(Employee::getId)
                .map(ArrayList::new);



    }

    public static void print(Employee employee) {
        System.out.println(employee);
    }
}
