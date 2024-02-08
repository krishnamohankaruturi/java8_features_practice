package org.example.collectionInterview;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if(this.contains(0))
            return  true;
        else
            return  super.add(o);
    }

    public static void main(String[] args) {
        CustomArrayList cal = new CustomArrayList();
        cal.add("mahesh");
        cal.add("suresh");
        cal.add("mahesh");
        cal.add("rajesh");
        System.out.println(cal);
    }
}
