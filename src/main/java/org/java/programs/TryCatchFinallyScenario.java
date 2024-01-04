package org.java.programs;

public class TryCatchFinallyScenario {

    public static void main(String[] args) {
        System.out.println("Value returned by the method: " +m1(10));
    }

    static Integer m1(Integer number) {
        try {
            Integer result = number/0;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("We are in Catch block");
            e.printStackTrace();
            return -1;
        } finally {
            System.out.println("We are in finally block");
        }
    }
}
