package org.java.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Hello");
        map.put(null, "Hola");
        map.put(3, "Caio");
        map.put(2, "De Rein");

        System.out.println("Map: " + map + "\n");

        boolean result = map.replace(1, "Hello", "Hiii");
        System.out.println("Replace returning boolean: " + result);
        System.out.println("Map after replacing value: " + map + "\n");

        // This will return the old value
        String value = map.replace(null, "Holaaa");
        System.out.println("Replace returning value: " + value);
        System.out.println("Map after replacing value: " + map);

        // Iterate over the map (order of access)
        System.out.println("Order of Access:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // TODO: 26-05-2023  Need to work on this order of access

        System.out.println("\nAccess an element to change the order of access:");
        System.out.println("Value for null: " + map.get(null));


        // Iterate again after access
        System.out.println("\nOrder of Access after Element Access:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}