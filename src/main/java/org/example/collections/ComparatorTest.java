package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args) {
        ArrayList<Emp> al = new ArrayList<Emp>();
        al.add(new Emp(222,"suresh"));
        al.add(new Emp(111,"mahesh"));
        al.add(new Emp(333,"rajesh"));
        //Collections.sort(al, new EidComparator());
        Collections.sort(al, new EnameComparator());
        for(Emp e : al)
            System.out.println(e.eid+"..........."+e.ename );
    }
}
