package org.java.singleton.org.java.simple;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Check a number is even or odd using bitwise AND

        int number = 9;

        if((number & 1) == 0) {
            System.out.println(number + " is even.");
        }else {
            System.out.println(number + " is odd.");
        }
    }
}