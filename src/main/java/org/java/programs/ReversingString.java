package org.java.programs;

import java.util.ArrayList;
import java.util.List;

public class ReversingString {

    public static void main(String[] args) {
        String str = "Someone";
        reversingString(str);
        reversingStringUsingStringBuilder(str);
        reversingStringUsingCharArray(str);
    }

    private static void reversingString(String str) {
        char[] charArray = str.toCharArray();
        List<Character> reversedString = new ArrayList<>();

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString.add(charArray[i]);
        }

        System.out.println("Using Collections: " + reversedString.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
    }

    private static void reversingStringUsingStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println("Using StringBuilder: " + stringBuilder);
    }

    private static void reversingStringUsingCharArray(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        System.out.println("Using Char Array: " + new String(charArray));
    }
}
