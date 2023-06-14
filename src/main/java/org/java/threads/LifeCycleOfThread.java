package org.java.threads;

public class LifeCycleOfThread extends Thread {

    // Thread has the following lifecycle
    /*
    1.  New State
    2. Active State
    3. Waiting/Blocked State
    4. Timed Waiting State
    5. Terminated State
     */

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());

        //start the thread
        thread.start();

        //wait for the thread to finish tasks
        thread.join();

        //statement printing the program is complete
        System.out.println("Program finished");

    }

    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            //print a message to indicate that the thread has started
            System.out.println("Thread is running");

            //Giving some work
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //print a message to indicate that the thread has finished
            System.out.println("Thread is finished");
        }
    }
}
