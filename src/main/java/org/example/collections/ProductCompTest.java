package org.example.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ProductCompTest {
    public static void main(String[] args) {
        LinkedList<Product> linkedList = new LinkedList<Product>();
        linkedList.add(new Product(20,"Mobils"));
        linkedList.add(new Product(40,"bottles"));
        linkedList.add(new Product(10,"laptops"));
        Collections.sort(linkedList);
        for (Product p: linkedList)
            System.out.println(p.pid+"................"+p.pname);
    }
}
