package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ramesh");
        al.add("mahesh");
        al.add("rajesh");
        al.add("suresh");
        Iterator it = al.iterator(); // without generics
        while (it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
        Iterator<String>  itg = al.iterator();
        while (itg.hasNext()){
            String s = itg.next();
            System.out.println(s);
        }
    }

}
