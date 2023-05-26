package org.java.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Hello");
        treeMap.put(2, "World");
        treeMap.put(3, "Hola");
        treeMap.put(6, "Ciao");
        treeMap.put(4, "Salut");

        System.out.println("TreeMap: " + treeMap);

        // Removing from TreeMap

        String value = treeMap.remove(3);
        System.out.println("Returns value if removed using key:: " + value);
        // This will not remove the key-value pair from the map
        boolean result = treeMap.remove(2, "Worlds");
        System.out.println("Returns boolean if removed using key and value:: " + result);

        System.out.println("TreeMap after removing: " + treeMap);

        // Another example for TreeMap
        Map<String, Integer> treeMap1 = new TreeMap<>();

        treeMap1.put("Apple", 1);
        treeMap1.put("Banana", 2);
        treeMap1.put("Custard Apple", 3);
        treeMap1.put("Dragon Fruit", 4);
        treeMap1.put("", 5);
        // treeMap1.put(null, 8); null keys are not allowed in TreeMap. It'll throw a NPE

        System.out.println("TreeMap1: " + treeMap1 + "\n");

        // Iterating a TreeMap
        Iterator<?> iterator = treeMap1.keySet().iterator();

        System.out.println("Printing the key-value pairs using iterator: ");
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println("Key: " + key + ", " + "Value: " + treeMap1.get(key));
        }
    }
}