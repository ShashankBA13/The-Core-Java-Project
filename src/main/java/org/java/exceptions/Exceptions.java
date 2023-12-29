package org.java.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        try {
            int i = 1/0;
        } catch (Exception e) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Inside catch of catch block");
            } finally {
                System.out.println("Inside catch finally");
            }
        } finally {
            System.out.println("Inside outer finally");
        }
    }
}
