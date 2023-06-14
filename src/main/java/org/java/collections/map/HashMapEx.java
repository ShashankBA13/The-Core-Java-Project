package org.java.collections.map;

import java.util.*;

public class HashMapEx extends Object {

    public static void main(String[] args) {

        HashMapEx h = new HashMapEx();

        Map<? super Integer, ? super String> map = new HashMap<>();

        // Can't be sure insertion order will be preserved
        map.put(1, "Name");
        map.put(2, "Som other name");
        map.put(6, "Another name");
        map.put(3, "A good name");
        map.put(4, "Name");
        map.put(5, new String("ola senior"));

        List<? super String> list = new ArrayList<>();
        list.add((String) map.get(1));
        list.add("Hello");

        System.out.println(map);

        // Iterating the map using iterator
        Iterator<Integer> iterator = (Iterator<Integer>) map.keySet().iterator();

        while (iterator.hasNext()) {
            iterator.next(); // If this is commented, throws IllegalStateException. Because the iterator doesn't have the element
            iterator.remove();
            System.out.println(map);
        }

        Set<?> set = map.entrySet();
        System.out.println("The value of the set is: " + set);
    }
}