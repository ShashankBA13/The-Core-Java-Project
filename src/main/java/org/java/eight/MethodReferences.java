package org.java.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {

        // These are Reference to a Static Method
        // Lambda expression
        Function<String, Integer> parseIntLambda = s -> Integer.parseInt(s);

        // Method Reference
        Function<String, Integer> parseIntMethodReference = Integer::parseInt;

        // Applying the function
        String stringToParse = "51";
        Integer lambdaResult = parseIntLambda.apply(stringToParse);
        Integer methodReferenceResult = parseIntMethodReference.apply(stringToParse);

        System.out.println("Integer parsed from String Using Lambda: " + lambdaResult);
        System.out.println("Integer parsed from String Using Method Reference: " + methodReferenceResult);

        // Reference to an instance method
        // Lambda expression
        Function<String, Integer> checkStringLengthUsingLambda = s -> s.length();
        // Method Reference
        Function<String, Integer> checkStringLengthUsingMethodRef = String::length;

        String stringToCheckLength = "Hello World";

        System.out.println("Length of the string \"" + stringToCheckLength + "\" is " + checkStringLengthUsingLambda.apply(stringToCheckLength));
        System.out.printf("Length of the string \"%s\" is %d%n", stringToCheckLength, checkStringLengthUsingLambda.apply(stringToCheckLength));

        // Reference to a constructor
        // Lambda expression
        Supplier<List<String>> listConstructorLambda = () -> new ArrayList<>();

        // Method reference
        Supplier<List<String>> listConstructorReference = ArrayList::new;

        System.out.println(listConstructorReference.get());
    }
}
