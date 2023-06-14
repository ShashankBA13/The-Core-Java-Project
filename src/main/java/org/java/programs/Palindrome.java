package org.java.programs;

public class Palindrome {

    public static void main(String[] args) {
        String str = "123321";
        palindromeCheck(str);
    }

    private static void palindromeCheck(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (str.equalsIgnoreCase(String.valueOf(stringBuilder))) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }

}