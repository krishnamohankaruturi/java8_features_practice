package org.example.collections;

import java.util.Comparator;

public class Product2NameComp implements Comparator<Product2> {

    @Override
    public int compare(Product2 o1, Product2 o2) {
        return -o1.pname.compareTo(o2.pname);
    }
}
