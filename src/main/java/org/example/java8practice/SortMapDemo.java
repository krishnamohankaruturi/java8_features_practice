package org.example.java8practice;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
      /*  Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String,Integer>  entry : entries){
            System.out.println(entry.getKey()+".........."+entry.getValue());
        }*/
        Collections.sort(entries, (o1, o2)  ->   o1.getKey().compareTo(o2.getKey()));
        for(Map.Entry<String,Integer>  entry : entries){
            System.out.println(entry.getKey()+".........."+entry.getValue());
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t -> System.out.println(t));
        System.out.println("************************************");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t -> System.out.println(t));

        Map<Employee, Integer> empMap = new TreeMap<Employee,Integer>(( o1,  o2) ->  (int) (o1.getSalary()-o2.getSalary()));
        empMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        empMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        empMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        empMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        empMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
        System.out.println(empMap);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(t -> System.out.println(t));
        System.out.println("------------------------------------------------------------------------------------");
        empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(t -> System.out.println(t));
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
        empMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t -> System.out.println(t));




    }
}
