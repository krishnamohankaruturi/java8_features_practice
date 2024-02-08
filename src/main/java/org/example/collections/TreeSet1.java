package org.example.collections;

import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<String>  tset = new TreeSet<String>(new TreeComparator());
        tset.add("ratan");
        tset.add("anu");
        tset.add("mahesh");
        tset.add("kaka");
        System.out.println(tset);//[ratan, mahesh, kaka, anu] with comparator
        // [anu, kaka, mahesh, ratan] without comparator









    }
}
