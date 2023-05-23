package org.java.threads;

public class TypesOfThreads extends Thread {


    public TypesOfThreads(Runnable runnable) {
    }

    public TypesOfThreads() {
    }

    /*There are two types of threads
     * 1. User threads
     * 2. Daemon threads
     */

    /*
     * 1. User threads : User threads are threads which are created by the application or user. They are high priority threads.
     *                   JVM will not exit until all user threads finish their execution. JVM wait for user threads to finish their task.
     *                   These threads are foreground threads.
     */

    /* 2. Daemon threads: These are created by the JVM. It runs in the background, to perform some tasks like Garbage Collection.
     *                    Less priority threads. JVM will not wait for these threads to complete their tasks. It'll exit as soon as
     *                    user threads are executed.
     */

    @Override
    public void run() {
        // Some functional code here
    }

    public static void main(String[] args) {

        TypesOfThreads thread = new TypesOfThreads();
        thread.start();
        System.out.println("thread.isDaemon() = " + thread.isDaemon()); // Output: false

        thread.setDaemon(true);
        System.out.println("thread.isDaemon() after setting the thread to daemon explicitly = " + thread.isDaemon()); // Output: true

        TypesOfThreads threads = new TypesOfThreads(() -> System.out.println("From anonymous inner class"));

        threads.start();
    }
}
