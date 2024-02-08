package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ramesh");
        al.add("mahesh");
        al.add("rajesh");
        al.add("suresh");
        Iterator<String > itr = al.iterator();
        while (itr.hasNext()){
            if(itr.next().equals("rajesh"))
                itr.remove();
        }
        System.out.println(al);
    }
}
