package org.java.collections.map;

import java.util.*;

public class HashMapEx {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Can't be sure insertion order will be preserved
        map.put(1, "Name");
        map.put(2, "Som other name");
        map.put(6, "Another name");
        map.put(3, "A good name");
        map.put(4, "Name");
        map.put(null, "Shashank");
        map.put(null, "Srikanth");

        System.out.println(map);

        // Iterating the map using iterator
        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            iterator.next(); // If this is commented, throws IllegalStateException. Because the iterator doesn't have the element
            iterator.remove();
            System.out.println(map);
        }

        Set<?> set = map.entrySet();
        System.out.println("The value of the set is: " + set);
    }
}