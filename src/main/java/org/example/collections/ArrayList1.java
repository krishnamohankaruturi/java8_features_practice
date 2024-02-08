package org.example.collections;

import java.util.ArrayList;

public class ArrayList1
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Employee(1, "krishna"));
        al.add(new Student(1, "tinku"));
        al.add("ratan");
        al.add(10);
        al.add(null);
        System.out.println(al.toString());
        for(Object a: al){
            if(a instanceof  Employee){
                Employee e = (Employee) a;
                System.out.println(e.eid+"  "+e.ename);
            }
            if(a instanceof  Student){
                Student s = (Student) a;
                System.out.println(s.sid+"   "+s.sname);
            }
            if(a instanceof  Integer){
                System.out.println(a);
            }
        }
// Collections are not type safe
    }
}
