package org.example.collections;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>  llist = new LinkedList<String>();
        llist.add("ratan");
        llist.add("anu");
        llist.add("durga");
        System.out.println(llist);
        llist.addFirst("aaa");
        llist.addLast("zzz");
        System.out.println(llist);
        System.out.println(llist.size());
        llist.add(2,"sravya");
        System.out.println(llist);
        llist.set(1,"anushka");
        llist.remove(2);
        System.out.println(llist);




    }
}
