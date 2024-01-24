package org.java.prac;

@FunctionalInterface
public interface FunctionalInterfaceEx {

    Integer printSomething(Integer number);

    static void printSomething(String someString) {
        System.out.println("The Provided string is: " + someString);
    }

    default double performAddition(Integer x, Double y) {
        return x + y;
    }
}
