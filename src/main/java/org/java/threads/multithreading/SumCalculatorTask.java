package org.java.threads.multithreading;

public class SumCalculatorTask implements Runnable {

    private final int[] numbers;

    private int sum;

    public SumCalculatorTask(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
    }

    public int getSum() {
        return sum;
    }

}