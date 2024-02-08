package org.example.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Emp> lhs = new LinkedHashSet<Emp>();
        lhs.add(new Emp(111, "ramesh"));
        lhs.add(new Emp(333, "mamesh"));
        lhs.add(new Emp(222, "suresh"));
        Iterator<Emp> itr = lhs.iterator();
        while (itr.hasNext())
        {
            Emp e = itr.next();
            if(e.eid==111)
                itr.remove();
            if(e.ename.equals("suresh"))
                itr.remove();
        }
        for(Emp e: lhs)
        {
            System.out.println(e.eid+"........"+e.ename);
        }

    }
}
