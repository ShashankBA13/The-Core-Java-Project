package org.java.programs;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Integer number = 11;
        boolean isPrime = true;

        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
