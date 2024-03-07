package org.java;

public class ThreadsPractice {

    public static void main(String[] args) {
        String currentThread = Thread.currentThread().getName();
        System.out.println(currentThread);

        Thread thread1 = new Thread(() -> someTimeConsumingMethod()); // Lambda expression
//        Thread thread1 = new Thread(ThreadsPractice::someTimeConsumingMethod); // Method Ref Example
        thread1.start(); // Use start() to start a new thread
        thread1.run(); // Use run() to use the current thread, which will be the main thread in this case
    }

    // Bad Practice to make the whole method synchronized
    public static synchronized void someTimeConsumingMethod() {
        System.out.println("-------Start----------");
        System.out.println("Some Long time consuming task");
        System.out.println(Thread.currentThread().getName());
        System.out.println("-------End----------");
    }
}
