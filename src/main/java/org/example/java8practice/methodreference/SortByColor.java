package org.example.java8practice.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortByColor {
    public static void main(String[] args) {
        List<Color> listOfColors = getListOfColors();
        List<String> sortedListofColors = listOfColors.stream().map(c -> c.getName()).sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(sortedListofColors);
        List<String> sortedListofColors2 = listOfColors.stream().map(Color::getName).sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortedListofColors2);

    }

    public static List<Color> getListOfColors() {
        List<Color> listOfColors = new ArrayList<>();

        Color red = new Color("Red", "#FF0000");
        Color blue = new Color("Blue", "0000FF");
        Color white = new Color("White", "#FFFFFF");
        Color green = new Color("Green", "#008000");

        listOfColors.add(red);
        listOfColors.add(blue);
        listOfColors.add(white);
        listOfColors.add(green);

        return listOfColors;

    }
}

