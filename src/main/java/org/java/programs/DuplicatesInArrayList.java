package org.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DuplicatesInArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "a", "A", "B", "C"));
        TreeSet<String> set = new TreeSet<>(list);
        System.out.println("Original array: " + list);
        System.out.println("UnDuplicated array: " + set);

        duplicateRemoveUsingEight(list);
    }

    private static void duplicateRemoveUsingEight(List<String> list) {
        List<String> unduplicated = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("UnDuplicated: " + unduplicated);
    }
}