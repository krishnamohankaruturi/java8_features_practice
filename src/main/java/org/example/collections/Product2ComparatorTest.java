package org.example.collections;

import java.util.Collections;
import java.util.LinkedList;

public class Product2ComparatorTest {
    public static void main(String[] args) {
        LinkedList<Product2> linkedList= new LinkedList<Product2>();
        linkedList.add(new Product2(11, "books",666));
        linkedList.add(new Product2(22, "pens",60));
        linkedList.add(new Product2(33, "bags",2000));
        Collections.sort(linkedList, new Product2NameComp());
        for (Product2 p: linkedList)
            System.out.println(p.pid+"............."+p.pname);

    }
}
