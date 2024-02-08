package org.example.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Book> linkedList = new LinkedList<Book>();
        linkedList.add(new Book(111,"C", "Dennis"));
        linkedList.add(new Book(222,"Java", "james"));
        linkedList.add(new Book(333,"C ++", "haha"));
        ListIterator<Book> litr = linkedList.listIterator();
        while (litr.hasNext())
        {
            if(litr.next().name.equals("C"))
                litr.remove();
        }
        for(Book b : linkedList){
            System.out.println(b.id+"     "+ b.name);
        }

    }
}
