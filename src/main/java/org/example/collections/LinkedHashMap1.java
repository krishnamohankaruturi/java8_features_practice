package org.example.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Emp,Product2> lh = new LinkedHashMap<Emp, Product2>();
        lh.put(new Emp(1, "mahesh"), new Product2(333, "mobiles",5000));
        lh.put(new Emp(3, "rajesh"), new Product2(555, "pens",500));
        lh.put(new Emp(2, "suresh"), new Product2(444, "laptops",50000));
        Set<Emp> emps = lh.keySet();
        System.out.println(emps);
        for(Emp e: emps)
        {
            System.out.println(e.eid+"........."+e.ename);
        }
        for(Emp e:lh.keySet()){
            System.out.println(e.eid+".............."+e.ename);
        }
        for(Product2 p: lh.values()){
            System.out.println(p.pid+"........"+p.pname);
        }
        Set<Map.Entry<Emp,Product2>> entries= lh.entrySet();
        for(Map.Entry<Emp,Product2>  entry: entries)
        {
            System.out.println(entry.getKey().eid+"..............."+entry.getValue().pname);
        }

    }
}
