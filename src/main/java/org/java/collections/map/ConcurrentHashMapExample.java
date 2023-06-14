package org.java.collections.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

//    public static void main(String[] args) {
//        WordCounter wordCounter1 = new WordCounter();
//        WordCounter wordCounter2 = new WordCounter();
//
//        // Create an ExecutorService to manage the threads
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Long startTime = System.currentTimeMillis();
//        // Create multiple threads to process the text concurrently
//        executorService.execute(() -> wordCounter1.processText("Hello world hello"));
//        executorService.execute(() -> wordCounter2.processText("OpenAI ChatGPT is amazing"));
//
//        executorService.execute(() -> wordCounter1.processText("Hello world hello hello hello"));
//
//        // Shutdown the ExecutorService
//        executorService.shutdown();
//
//        // Wait for all threads to complete
////        while (!executorService.isTerminated()) {
////            // Do nothing
////        }
//
//        try {
//            executorService.awaitTermination(5, TimeUnit.MILLISECONDS);
//        } catch (InterruptedException e) {
//            // Handle interruption
//        }
//        Long endTime = System.currentTimeMillis();
//
//        // Print the word counts from both instances
//        System.out.println("Word Counts from wordCounter1:");
//        System.out.println("Hello: " + wordCounter1.getCount("Hello"));
//        System.out.println("World: " + wordCounter1.getCount("World"));
//
//        System.out.println("\nWord Counts from wordCounter2:");
//        System.out.println("OpenAI: " + wordCounter2.getCount("OpenAI"));
//        System.out.println("ChatGPT: " + wordCounter2.getCount("ChatGPT"));
//
//        System.out.println(endTime - startTime + "ms");
//    }

    private static
    ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            map.put("Hello", "World!");
            map.put("Hola", "World!");
            map.put("Caio", "World!");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            map.remove("Hello");
        });

        Thread t3 = new Thread(() -> {
            map.get("Hola");
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(map);
    }
}

class WordCounter {

    private Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    public void processText(String text) {
        String[] words = text.split("\\s+");

        for (String word : words) {
            concurrentHashMap.compute(word, (key, value) -> (value == null) ? 1 : value + 1);
        }
    }

    public int getCount(String word) {
        return concurrentHashMap.getOrDefault(word.toLowerCase(), 0);
    }
}