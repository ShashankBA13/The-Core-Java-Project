package org.java.threads;

public class ThreadUsingImplementsRunnable implements Runnable {

    /*Why go for this approach
     * If we want to implement another interface or extend another classes this approach will allow it
     *It won't load all the overhead methods */

    // Refer this link to dive into more on the topic: https://javaconceptoftheday.com/extends-thread-vs-implements-runnable-in-java/

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadUsingImplementsRunnable());
        thread.start();

        // Check out all the other methods as well
    }

    @Override
    public void run() {
        // Some code here
    }
}
