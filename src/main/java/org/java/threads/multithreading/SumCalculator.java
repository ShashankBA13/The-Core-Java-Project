package org.java.threads.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class SumCalculator {

    private static final int NUM_OF_THREADS = Runtime.getRuntime().availableProcessors();
    private static final String fileName = "ListOfRandomNumbers";
    private static int count;

    public static void main(String[] args) {
        System.out.println("No of processors available: " + NUM_OF_THREADS);

        for (int i = 0; i < 5; i++) {
            System.out.println(SumCalculator.fileNameGenerator());
        }

        int[] numbers = generateNumbers(10);

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int num : numbers) {
                System.out.println("num = " + num);
                writer.write(Integer.toString(num));
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getName());
        }
    }

    static String fileNameGenerator() {
        String fileNameNumber = fileName + count + ".txt";
        count++;
        return fileNameNumber;
    }

    private static int[] generateNumbers(int num) {
        // Generate an array of random numbers

        Random random = new Random();
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}