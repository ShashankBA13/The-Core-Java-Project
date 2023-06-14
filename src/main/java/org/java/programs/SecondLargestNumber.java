package org.java.programs;

import java.util.*;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Integer[] numbers = {2, 87, 343, 7886, 233, 6868, 356, 32256, 32256};

        secondLargestNumber(numbers);
        secondHighestUsingStreams(numbers);
    }

    private static void secondHighestUsingStreams(Integer[] numbers) {
        Integer secondHighest = Arrays.asList(numbers).stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondHighest);
    }

    private static void secondLargestNumber(Integer[] numbers) {
        List<Integer> sortedSet = new ArrayList<>(Arrays.asList(numbers));
        Collections.sort(sortedSet, Collections.reverseOrder());
        System.out.println(sortedSet.get(1));
    }
}