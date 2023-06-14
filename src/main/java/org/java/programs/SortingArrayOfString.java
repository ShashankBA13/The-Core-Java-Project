package org.java.programs;

import java.util.Arrays;

public class SortingArrayOfString {

    public static void main(String[] args) {
        String[] str = {"Aa", "Bb", "Cc", "Dd", "Ee", "Ff"};

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].compareToIgnoreCase(str[i]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[i] = temp;
                }
            }
        }
        System.out.println(Arrays.asList(str));
    }
}