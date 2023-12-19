package org.java.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressions {

    public static void main(String[] args) {

        final List<Float> numbers = Arrays.asList(3.76858f, 8.65747f, 1.748f, 2.45f, 5.464f, 7484.7494f);
        System.out.println("Initial list: " + numbers);

        // Sorting the numbers from highest to lowest before Java8
        numbers.sort(new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Sorted list using Comparator: " + numbers);

        // Using Lambda expressions from Java8

        numbers.sort((number1, number2) -> number1.compareTo(number2));
        //Collections.sort(numbers, Float::compareTo); // A method in the Float.class
        //Collections.sort(numbers, Comparator.naturalOrder());
        //Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("Sorted list using Lambda expressions: " + numbers);


        //Lambda expression to print the elements of the list
        //numbers.forEach(i -> System.out.println(i));

        Consumer<Float> consumer = (n) -> System.out.println(n);
        numbers.forEach(consumer);

        // Lambda expressions on functional interface
        Interface impl = (i) -> System.out.println("\n" + "Hello");
        impl.print(10);
        impl.hello();
    }
}