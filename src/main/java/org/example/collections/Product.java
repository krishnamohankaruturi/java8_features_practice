package org.example.collections;

public class Product implements  Comparable<Product> {
    int pid;
    String pname;

    public Product(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    @Override
    public int compareTo(Product o) {
        if(pid==o.pid)
            return  0;
        else if (pid > o.pid)
            return  -1;
        else
            return  1;
    }
}
