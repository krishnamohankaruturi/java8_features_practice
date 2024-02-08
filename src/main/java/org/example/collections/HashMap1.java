package org.example.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hp = new HashMap<Integer, String>();
        hp.put(1, "Mahesh");
        hp.put(4, "Suresh");
        hp.put(9, "Rajesh");
        hp.put(33, "lankesh");
        System.out.println(hp);
        Set<Integer> h = hp.keySet();
        System.out.println(h);
        Collection<String> values = hp.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entries = hp.entrySet();
        for (Map.Entry<Integer,String> map: entries)
        {
            System.out.println(map.getKey()+"............."+map.getValue());

        }



    }
}
