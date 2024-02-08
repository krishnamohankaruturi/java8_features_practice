package org.example.collections;

import java.util.Comparator;

public class ProducttreeCOmp implements Comparator<Product2> {

    @Override
    public int compare(Product2 o1, Product2 o2) {
        if (o1.pid == o2.pid)
            return 0;
        else if (o1.pid > o2.pid) {
            return 1;
        } else
            return -1;
    }
}
