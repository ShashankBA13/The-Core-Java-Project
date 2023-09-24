package org.java.programs;

import java.util.Arrays;

public class SortingArrayOfString {

    public static void main(String[] args) {
        String[] str = {"Sss", "Aa", "Bb", "Gg", "H", "Cc", "Dd", "Ee", "Ff"};

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].compareToIgnoreCase(str[i]) > 0) {
                    // Using Bubble sort
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println(Arrays.asList(str));
    }
}