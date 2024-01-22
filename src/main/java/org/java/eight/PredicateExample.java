package org.java.eight;

import java.util.function.*;

public class PredicateExample {

    public static void main(String[] args) {

        /*
         * The Predicate interface represents a predicate (boolean-valued function) of one argument.
         * */

        Predicate<String> isLong = s -> s.length() >= 10;
        Predicate<String> negateIsLong = isLong.negate();

        System.out.println("Result for predicate isLong: " + isLong.test("Hello World"));
        System.out.println("Result for negate of isLong: " + negateIsLong.test("Hello World"));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("\nChecking if a number is even: " + isEven.test(10));
        System.out.println(isEven.test(11));

        // Using and & or off predicate
        Predicate<Integer> isGreaterThanZero = n -> n > 0;
        Predicate<Integer> isEvenAndPositive = isEven.and(isGreaterThanZero);
        Predicate<Integer> isEvenOrPositive = isEven.or(isGreaterThanZero);

        System.out.println("Check if a no is even and positive: " + isEvenAndPositive.test(1));
        System.out.println("Check if a no is even and positive: " + isEvenAndPositive.test(-1));

        System.out.println("\nCheck if a no is even or positive: " + isEvenOrPositive.test(1));
        System.out.println("Check if a no is even or positive: " + isEvenOrPositive.test(-1));

        // Different kinds of predicate

        IntPredicate intPredicate = n -> n == 0;
        DoublePredicate doublePredicate = n -> n == 1.1111;
        LongPredicate longPredicate = n -> n == 1111111111;
        BiPredicate<String, Integer> biPredicate = (string, value) -> string.length() == value;
        Predicate<?> isNotEmpty = s -> s.equals("Something");

        // Test BiPredicate
        boolean result = biPredicate.test("Hello", 6);
        System.out.println("Result: " + result);

    }
}
