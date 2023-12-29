package org.java.exceptions;

public class UncheckedToCheckedWrapping {

    public static void doSomething() throws CustomException {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            throw new CustomException("Wrapping of UncheckedToCheck exception", e);
        }
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (CustomException e) {
            System.out.println("Message: " +e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}