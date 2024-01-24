package org.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaExpressions {

    public static void main(String[] args) {

        // They are mainly used to simplify, concise the implementation of FI

        // Traditional anonymous implementation of runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run method. Can preform some tasks here");
            }
        };

        runnable.run();

        Runnable runnableLambda = () -> System.out.println("Inside run method implemented using lambda");

        runnableLambda.run();

        // Lambda expressions with parameters
        BiFunction<Integer, Integer, Integer> addTwoThings = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> addTwoThingsWithMR = Integer::sum; // Internally it lloks like this (a, b) -> Integer.sum(a, b);

        System.out.println(addTwoThings.apply(1, 2));
        System.out.println(addTwoThingsWithMR.apply(3, 4));

        // Using with Stream API
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
