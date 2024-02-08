package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class BookIterator {
    public static void main(String[] args) {
        ArrayList<Book> books= new ArrayList<Book>();
        books.add(new Book(111, "C lan", "Dennis"));
        books.add(new Book(222, "C ++", "haha"));
        books.add(new Book(333, "Java", "hoho"));
        Iterator<Book>  itr = books.iterator();
        while (itr.hasNext()){
            Book b = itr.next();
            if(b.id==111)
                itr.remove();
        }
        for(Book b: books){
            System.out.println(b.id+"......."+b.name);
        }

    }
}
