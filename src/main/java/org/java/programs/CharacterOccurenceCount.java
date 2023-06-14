package org.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurenceCount {

    public static void main(String[] args) {
        String str = "AaBbCcDdEE";

        Map<Character, Integer> occurences = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (occurences.containsKey(str.charAt(i))) {
                occurences.put(str.charAt(i), occurences.get(str.charAt(i)) + 1);
            } else {
                occurences.put(str.charAt(i), 1);
            }
        }
        System.out.println(occurences);

        Map<Character, Integer> occurrences = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));
//        System.out.println("Using Java8: " + occurrences);

    }
}