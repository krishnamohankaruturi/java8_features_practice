package org.example.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedhashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("ratan");
        lhs.add("mahesh");
        HashSet<String> hs = new HashSet<String>();
        hs.add("ratan");
        System.out.println(hs);

        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        lhs2.add("ratan");
        LinkedHashSet<String> lhs3 = new LinkedHashSet<>();
        lhs3.add("durga");

        LinkedHashSet<String> lhs4 = new LinkedHashSet<>();
        lhs4.addAll(hs);
        lhs4.addAll(lhs2);
        lhs4.addAll(lhs3);
        lhs4.add("mama");
        System.out.println(lhs4);



    }
}
