package org.java.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Hello");
        treeMap.put(2, "World");
        treeMap.put(3, "Hola");
        treeMap.put(4, "Salut");

        System.out.println(treeMap);
    }
}