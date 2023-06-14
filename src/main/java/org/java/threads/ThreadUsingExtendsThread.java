package org.java.threads;

public class ThreadUsingExtendsThread extends Thread {

    /*Why use extends Thread
     * There are a lot of methods available in the thread class
     * Only use it in case your code requires all these methods
     * If not implements Runnable is a better choice.
     * As it improves code reusability */

    // Refer this link to dive into more on the topic: https://javaconceptoftheday.com/extends-thread-vs-implements-runnable-in-java/

    public static void main(String[] args) {
        ThreadUsingExtendsThread thread = new ThreadUsingExtendsThread();
        thread.start();


        System.out.println("thread.getName() = " + thread.getName());
        System.out.println("The thread id for t is: " + thread.threadId());
        System.out.println("thread.getPriority() = " + thread.getPriority());

        thread.setPriority(10);

        System.out.println("thread.getPriority() after setting priority= " + thread.getPriority());
        System.out.println("thread.getState() = " + thread.getState());

        // Lot of other methods are available as well. Please explore all the methods.

    }

    @Override
    public void run() {
        System.out.println("Hello from the run method");
    }
}
