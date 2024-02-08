package org.example.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ramesh");
        al.add("mahesh");
        al.add("rajesh");
        al.add("suresh");
        ListIterator<String> litr = al.listIterator();
        litr.add("sravya");
        while (litr.hasNext()) {
            String s = litr.next();
            if (s.equals("mahesh"))
                litr.remove();
            if (s.equals("rajesh"))
                litr.set("anushka");
        }
        System.out.println(al);

    }
}
