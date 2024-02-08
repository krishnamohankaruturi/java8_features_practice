package org.example.collections;

import java.util.Stack;

public class Stack1
{
    public static void main(String[] atanrgs) {
        Stack<String> s = new Stack<String>();
        s.push("ratan");
        s.push("anu");
        s.push("durga");
        System.out.println(s);
        System.out.println(s.search("ratan"));
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
