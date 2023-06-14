package org.java.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(12, "Hello");
        map.put(13, "Caio");
        map.put(1, "Cello");
        map.put(456, "Mexico");

        System.out.println("Map: " + map);

        SortedMap<Integer, String> subMap = map.subMap(1, 13);
        System.out.println("SubMap = " + subMap);

        SortedMap<Integer, String> headMap = map.headMap(13);
        System.out.println("HeadMap = " + headMap);

        SortedMap<Integer, String> tailMap = map.tailMap(14);
        System.out.println("TailMap = " + tailMap + "\n");

        doStuff();
    }

    public static void doStuff() {
        SortedMap<String, Integer> map = new TreeMap<>();

        map.put("Hello", 1);
        map.put("Hola", 2);
        map.put("Caio", 3);
        map.put("Salut", 4);

        System.out.println("Map = " + map);

        SortedMap<String, Integer> subMap = map.subMap("Aloha", "Dog");
        System.out.println("SubMap = " + subMap);

        SortedMap<String, Integer> headMap = map.headMap("R");
        System.out.println("headMap = " + headMap);

        SortedMap<String, Integer> tailMap = map.tailMap("I");
        System.out.println("tailMap = " + tailMap);
    }
}