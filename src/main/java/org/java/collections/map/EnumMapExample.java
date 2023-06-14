package org.java.collections.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);

        // Add entries to the EnumMap
        map.put(Day.MONDAY, "WORK");
        map.put(Day.TUESDAY, "WORK");
        map.put(Day.WEDNESDAY, "WORK");
        map.put(Day.SUNDAY, "ENJOY");
        map.put(Day.SATURDAY, "YAYY!!!!!!!");
        map.put(Day.THURSDAY, "NO WORK");

        System.out.println(map + "\n");

        for (Map.Entry<Day, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(map.hashCode());
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}