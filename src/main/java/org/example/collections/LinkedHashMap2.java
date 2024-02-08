package org.example.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Product2> plh = new LinkedHashMap<Integer, Product2>();
        plh.put(1, new Product2(111, "mobiles", 5555));
        plh.put(2, new Product2(222, "bottles", 555));
        plh.put(3, new Product2(333, "laptop", 55555));
        Set<Map.Entry<Integer, Product2>> entries = plh.entrySet();
        Iterator<Map.Entry<Integer, Product2>> iterator = entries.iterator();
        while (iterator.hasNext())
        {
            if(iterator.next().getValue().pid==111)
                iterator.remove();
        }
        for(Map.Entry<Integer, Product2> entry: entries)
        {
            System.out.println(entry.getKey()+"............"+entry.getValue().pname);
        }



    }
}
