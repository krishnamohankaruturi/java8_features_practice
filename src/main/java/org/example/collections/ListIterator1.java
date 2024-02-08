package org.example.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ramesh");
        al.add("mahesh");
        al.add("rajesh");
        al.add("suresh");
        ListIterator lit = al.listIterator();
        while (lit.hasNext()){
            String s =(String) lit.next();
            System.out.println(s);
        }
        while (lit.hasPrevious()){
            String s = (String) lit.previous();
            System.out.println(s);
        }


        ListIterator<String> litg = al.listIterator();// with Generics
        while (litg.hasNext()){
            String s = litg.next();
            System.out.println(s);
        }
        while (litg.hasPrevious())
        {
            String s = litg.previous();
            System.out.println(s);
        }
    }
}
