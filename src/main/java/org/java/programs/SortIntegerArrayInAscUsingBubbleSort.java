package org.java.programs;

import java.util.Arrays;

public class SortIntegerArrayInAscUsingBubbleSort {

    public static void main(String[] args) {
        Integer[] a = {5, 6, 3, 4, 56, 90};
        sortIntegerArray(a);
    }

    private static void sortIntegerArray(Integer[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.asList(a));
    }
}