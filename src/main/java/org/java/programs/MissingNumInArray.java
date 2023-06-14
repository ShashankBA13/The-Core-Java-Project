package org.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumInArray {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 8, 9, 11, 13, 15, 18, 22};

        int prev = array[0];

        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            if (current - prev > 1) {
                for (int j = prev + 1; j < current; j++) {
                    missingNumbers.add(j);
                }
            }
            prev = current;
        }

        int sum = Arrays.stream(array).reduce(0, (a, b) -> a + b);
        int sum1 = missingNumbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Missing numbers: " + missingNumbers);
        System.out.println("Total sum: " + (sum + sum1));
    }
}