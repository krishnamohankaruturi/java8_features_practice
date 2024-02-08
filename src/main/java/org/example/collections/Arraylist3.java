package org.example.collections;

import java.util.ArrayList;

public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        ArrayList<Integer> al2 = new ArrayList<>(al);
        al2.add(300);
        al2.add(400);
        System.out.println(al2);

    }
}
