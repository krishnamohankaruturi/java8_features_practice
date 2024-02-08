package org.example.collections;

import java.util.ArrayList;

public class ArrayList2
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(10.5);
        al.add("durga");
        al.add(null);
        System.out.println(al);
        System.out.println(al.size());
        al.add(2, "mahesh");
        al.remove("anu");
        al.set(1,55);
        al.remove(10);
        System.out.println(al);
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());

    }
}
