package org.java.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hola");
        list.add("caio");

//        Collections.reverse(list);
//        System.out.println(list);
//
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);

        list.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);
    }
}