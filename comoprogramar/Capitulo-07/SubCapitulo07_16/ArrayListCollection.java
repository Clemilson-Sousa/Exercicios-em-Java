package com.pratica.livro.comoprogramar.c07.sc07_16;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add(1, "Yellow");
        colors.add("Black");
        colors.add("Blue");

        dysplayList(colors, "Colors list by enhanced for:");

        System.out.printf("List colors size: %d%n", colors.size());

        colors.remove(3);
        colors.remove("Red");

        System.out.printf("\"Yellow\" is%s the colors list%n", colors.contains("Yellow") ? "" : "n't");

        System.out.printf("Colors list by count:%n");
        for (int count = 0; count < colors.size(); count++) {
            System.out.printf("%s%n", colors.get(count));
        }


    }

    public static void dysplayList(ArrayList<String> items, String header) {
        System.out.printf("%s%n", header);
        for (String item : items)
            System.out.printf("%s%n", item);
        System.out.println();
    }
}
