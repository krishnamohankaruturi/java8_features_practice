package org.example.java8features;

import org.example.entities.Notes;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateAsKey {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "maths", 11));
        noteLst.add(new Notes(2, "science", 22));
        noteLst.add(new Notes(3, "social", 33));
        noteLst.add(new Notes(4, "history", 44));
        noteLst.add(new Notes(5, "geography", 55));
        noteLst.add(new Notes(6, "history", 66));
        noteLst.add(new Notes(4, "biology", 66));
        LinkedHashMap<Integer, String>  map = noteLst.stream()
                .sorted(Comparator.comparingInt(Notes::getBookNo))
                .collect(Collectors.toMap(Notes::getBookNo, Notes::getName, (oldVal, newVal) -> newVal, LinkedHashMap::new));
        System.out.println(map);

     /*   Optional.ofNullable(noteLst)
                .orElseGet(Collections::emptyList)
                .stream().filter(Objects::nonNull)
                .map(note -> Notes::getName)
                .forEach(System.out::println);*/
    }
}
