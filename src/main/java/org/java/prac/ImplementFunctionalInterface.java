package org.java.prac;

public class ImplementFunctionalInterface implements FunctionalInterfaceEx {

    @Override
    public Integer printSomething(Integer number) {
        return number;
    }

    @Override
    public double performAddition(Integer x, Double y) {
        return FunctionalInterfaceEx.super.performAddition(x, y);
    }

    public static void main(String[] args) {
        FunctionalInterfaceEx functionalInterfaceEx = (x) -> {
            System.out.println(x);
            return x + x;
        };
        System.out.println(functionalInterfaceEx.printSomething(10));
    }
}
