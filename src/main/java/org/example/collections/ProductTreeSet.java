package org.example.collections;

import java.util.TreeSet;

public class ProductTreeSet {
    public static void main(String[] args) {
        TreeSet<Product2> ts = new TreeSet<Product2>(new ProducttreeCOmp());
        ts.add(new Product2(111, "mobiles", 6666.6));
        ts.add(new Product2(333, "bottles", 6666.6));
        ts.add(new Product2(222, "laptops", 6666.6));
        ts.add(new Product2(444, "tvs", 6666.6));
        for (Product2 p : ts) {
            System.out.println(p.pid + "..............." + p.pname);
        }

    }
}
