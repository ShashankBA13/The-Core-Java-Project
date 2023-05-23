package org.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumCalculator {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers(100000000);

        // Split the list into smaller chunks
        List<List<Integer>> chunks = splitList(numbers, NUM_THREADS);

        // Create a thread pool with the same number of threads as cores
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        // Submit each chunk to the thread pool
        List<SumCalculatorTask> tasks = new ArrayList<>();
        for (List<Integer> chunk : chunks) {
            SumCalculatorTask task = new SumCalculatorTask(chunk);
            tasks.add(task);
            executor.submit(task);
        }

        // Shutdown the thread pool once all tasks are complete
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Add up the individual sums to get the total sum
        int totalSum = 0;
        for (SumCalculatorTask task : tasks) {
            totalSum += task.getSum();
        }

        System.out.println("Total sum: " + totalSum);
    }

    private static List<Integer> generateNumbers(int num) {
        // Generate a list of random numbers
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    private static List<List<Integer>> splitList(List<Integer> list, int numChunks) {
        // Split the list into smaller chunks, each containing roughly the same number of integers
        List<List<Integer>> chunks = new ArrayList<>();
        int chunkSize = (int) Math.ceil((double) list.size() / numChunks);
        for (int i = 0; i < list.size(); i += chunkSize) {
            int endIndex = Math.min(i + chunkSize, list.size());
            chunks.add(list.subList(i, endIndex));
        }
        return chunks;
    }
}

class SumCalculatorTask implements Runnable {
    private List<Integer> numbers;
    private int sum;

    public SumCalculatorTask(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void run() {
        // Calculate the sum of the numbers in this chunk
        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
    }

    public int getSum() {
        return sum;
    }
}