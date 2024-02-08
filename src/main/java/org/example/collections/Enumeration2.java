package org.example.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration2 {
    public static void main(String[] args) {
        Vector  v=new Vector();
        v.add(new Employee(111,"ratan"));
        v.add(new Employee(222,"anu"));
        Enumeration<Employee> c=v.elements();
        while(c.hasMoreElements())
        {      System.out.println(c.nextElement());
        }
    }
}
