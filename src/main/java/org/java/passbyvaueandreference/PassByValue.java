package org.java.passbyvaueandreference;

public class PassByValue {

    static void setNumber(int number) {
        int x = 12;
        number = number + 2;
        System.out.println("Modified value inside the method: " + number);
    }

    public static void main(String[] args) {
        int number = 110;
        PassByValue passByValue = new PassByValue();
        System.out.println("Before calling: number = " + number);

        setNumber(111);
        System.out.println("After calling: number = " + number);
    }
}