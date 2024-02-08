package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ratan");
        arrayList.add("anu");
        arrayList.add("durga");
        System.out.println("Before sorting"+ arrayList);
        Collections.sort(arrayList);
        System.out.println("after sorting"+ arrayList);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(200);
        linkedList.add(30);
        Collections.sort(linkedList);
        System.out.println(linkedList);
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(null);
        Collections.sort(v);
        System.out.println(v);







    }
}
