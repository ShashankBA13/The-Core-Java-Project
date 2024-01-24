package org.java.eight.functionalInterface;


public class FunctionalInterfaceImpl {

    public static void main(String[] args) {
        FunctionalInterfaceEx functionalInterface = () -> System.out.println("Something");

        functionalInterface.m1();
    }
}
