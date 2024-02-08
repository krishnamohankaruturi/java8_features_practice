package org.example.collections;

import java.util.Objects;

public class Emp {
    int eid;
    String ename;



    public Emp(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return eid == emp.eid && Objects.equals(ename, emp.ename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, ename);
    }
}
