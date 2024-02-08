package org.example.miscellinious;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class Immutable {
    private final String empname;
    private final  int age;
    private final  Address address;
    private final  List<String> phonenumbers;
    private final  Map<String, String> metadata;

    public Immutable(String empname, int age, Address address, List<String> phonenumbers, Map<String, String> metadata) {
        this.empname = empname;
        this.age = age;
        this.address = address;
        this.phonenumbers = phonenumbers;
        this.metadata = metadata;
    }

    public String getEmpname() {
        return empname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    public List<String> getPhonenumbers() {
        return new ArrayList<>(phonenumbers);
    }

    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }
}
