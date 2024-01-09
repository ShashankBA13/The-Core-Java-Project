package org.java.programs;

import java.math.BigDecimal;

public class GarbageCollectionVisualisation {

    public static void main(String[] args) {
        createObjects();
    }

    private static void createObjects() {

        long count = 0;

        while (true) {
            // Creating short-lived objects just for illustration
            BigDecimal shortLivedBigDecimal1 = new BigDecimal(count++);
            System.out.println("shortLivedBigDecimal1 = " + shortLivedBigDecimal1);
        }
    }
}