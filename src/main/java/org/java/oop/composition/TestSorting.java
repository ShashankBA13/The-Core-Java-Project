package org.java.oop.composition;

import java.util.Arrays;
import java.util.TreeSet;

public class TestSorting {

    public static void main(String[] args) {

        String[] string = {"Cc", "Ce", "Cb", "Bb", "Aa"};
        TreeSet<String> set = new TreeSet<String>(Arrays.asList(string));
        System.out.println(set);


        for (int i = 0; i < string.length; i++) {
            for (int j = 0; j < string.length; j++) {
                if (string[j].compareToIgnoreCase(string[i]) > 0) {
                    String temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }
            }
        }

        // Print the sorted array
        for (String s : string) {
            System.out.println(s);
        }
    }
}