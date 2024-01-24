package org.java.eight.functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceEx {

    // A functional interface is an interface with one abstract method,

    void m1();

    default void m1(int i) {
        System.out.println("default method called with the value: " + i);
    }

    static void m2() {
        System.out.println("Inside static m2 method");
    }
}
