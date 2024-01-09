package org.java.eight;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ParallelArraySorting {

    public static void main(String[] args) {
        int[] arrayToSort = {3, 52, 45, 5643, 21, 55, 564, 5765, 23, 24, 543, 89, 34, 2, 23, 4, 56, 567, 586, 34, 323, 4, 446, 56, 345, 3, 52, 453, 46, 4, 74, 574, 7, 234, 135, 34, 6, 34};

        var startTime = System.nanoTime();
        // Arrays.parallelSort(arrayToSort);
        Arrays.sort(arrayToSort);
        var endTime = System.nanoTime();

        double elapsedSeconds = (endTime - startTime) / 1_000_000_000.0;
        String formattedTime = new DecimalFormat("0.000000000").format(elapsedSeconds);

        double elapsedMilliseconds = (endTime - startTime) / 1_000_000.0;
        String formattedTimeInMillis = new DecimalFormat("0.000").format(elapsedMilliseconds);

        System.out.println(Arrays.toString(arrayToSort) + " - " +
                "Sorted in " + (formattedTime) + " s" +
                " or " + (endTime - startTime) + " ns" +
                " or " + formattedTimeInMillis + " ms");
    }
}
