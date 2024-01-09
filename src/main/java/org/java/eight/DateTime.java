package org.java.eight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current Date and Time = " + today);

        LocalDateTime tomorrow = today.plusDays(1);
        System.out.println("Tomorrow's Date and Time = " + tomorrow);

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime parsedTime = LocalTime.parse("22:50:45", formatter);
        System.out.println("Midnight = " + midnight);
        System.out.println("Parsed Time = " + parsedTime);
    }
}