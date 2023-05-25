package org.java.collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class LinkedListEx {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        final List<String> list = new LinkedList<>();
        list.add("Some String");
        list.add("Some other String");
        list.add("Some other String");
        list.add("A different String");
        list.add(null);
        list.add(null);

//        list.set(1, "Hello");
        System.out.println(list);

        while (list.remove("Some other String")) ;

        System.out.println(list + "\n");

        Spliterator<String> spliterator = list.spliterator();

        while (spliterator.tryAdvance(System.out::println)) ;

        spliterator.forEachRemaining(System.out::println);// Using this wrong

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time = " + (endTime - startTime) + "ms");
    }
}