package org.example.collections;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "ramesh");
        Employee e2 = new Employee(222, "mahesh");
        Employee e3 = new Employee(333, "rajes");
        Employee e4 = new Employee(444, "suresh");
        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(e1);
        a1.add(e2);
        ArrayList<Employee> a2 = new ArrayList<>();
        a2.addAll(a1);
        a2.add(e3);
        a2.add(e4);
        /*System.out.println(a2.contains(e1));
        System.out.println(a2.containsAll(a1));
        a2.remove(e1);
        System.out.println(a2.contains(e1));
        System.out.println(a2.containsAll(a1));*/

        //a2.removeAll(a1);
        a2.retainAll(a1);
        
        for (Employee e : a2) {
            System.out.println(e.eid + "   " + e.ename);
        }

    }

}
