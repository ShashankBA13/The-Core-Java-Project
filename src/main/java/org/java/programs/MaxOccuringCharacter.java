package org.java.programs;

public class MaxOccuringCharacter {

    public static void main(String[] args) {
        String str = "hello world";

        char maxOccuringCharacter = findMaxOccuringCharacter(str);

        System.out.println("maxOccuringCharacter = " + maxOccuringCharacter);
    }

    private static char findMaxOccuringCharacter(String str) {
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < 200; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }
}
