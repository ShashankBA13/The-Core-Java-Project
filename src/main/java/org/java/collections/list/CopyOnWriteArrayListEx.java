package org.java.collections.list;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Hola");

        System.out.println("List: " + list);

        for (String element : list) {
            System.out.println("Element: " + element);
        }

        System.out.println(list.addIfAbsent("World"));
        System.out.println(list);
    }

    // TODO: 25-05-2023  Need to work more on this
}