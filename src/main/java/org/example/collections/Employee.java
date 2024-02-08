package org.example.collections;

public class Employee   implements  Comparable<Employee> {
    int eid;
    String ename;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public int compareTo(Employee o) {
        return  ename.compareTo(o.ename);
    }

   /* @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;
        if(eid==e.eid)
            return  0;
        if(eid> e.eid)
            return 1;
        else
            return  -1;
    }*/
}
