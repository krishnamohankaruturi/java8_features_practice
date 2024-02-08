package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableI {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(111, "ramesh"));
        al.add(new Employee(222, "mahesh"));
        al.add(new Employee(333, "suresh"));

        Collections.sort(al);
        for(Employee e : al)
            System.out.println(e.eid+"....."+e.ename);
    }
}
