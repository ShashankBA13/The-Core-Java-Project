package org.java.threads;

public class IllegalThreadStateException extends Thread{

    public void run() {
        try {
            System.out.println("Hello from try block of run method");
            Thread.sleep(1000);
        } catch (Exception  e) {
            e.printStackTrace();
        }
    }

    public static void main(String...  args) {
        IllegalThreadStateException illegalThreadStateException = new IllegalThreadStateException();
        Thread t = new Thread(illegalThreadStateException);

        /*  This is One way to create the exception
            t.start();
            t.start(); // Throws illegal thread state exception, because the thread is already running.
         */

        t.start();
        try {
            System.out.println("Inside the main method try block");
            Thread.sleep(3000);
            System.out.println("Main thread is active");
        }catch (Exception e) {
            e.getMessage();
        }

        // Throws an illegalThreadStateException because the main thread is already Dead.
        t.start();
        System.out.println("This won't be printed");
    }

}