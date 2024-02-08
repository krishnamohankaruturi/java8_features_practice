package org.example.miscellinious;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("street 1", "city X");
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("123456");
        phoneNumbers.add("456789");
        Map<String, String> metadata = new HashMap<>();
        metadata.put("hobby", "Watching Movies");

// Declare the employee
        Immutable e = new Immutable("John", 23, address, phoneNumbers, metadata);

// Update details
        e.getPhonenumbers().add("345123");
        e.getMetadata().put("skill", "Java");
        e.getMetadata().put("designation", "HR");

// change address details
        e.getAddress().setCity("c3");
        e.getAddress().setStreet("s3");

        System.out.println(e.getPhonenumbers());
        System.out.println(e.getMetadata());
        System.out.println(e.getAddress());
    }
}
