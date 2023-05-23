package org.java.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock extends Thread {

    public static void main(String[] args) {
        Lock resource1 = new ReentrantLock(true);
        Lock resource2 = new ReentrantLock(true);

         /*
          In this, Thread-0 has acquired resource1, and Thread-1 has acquired resource2.
          Both of them will then be waiting for the other thread to release the resource they need.
          This will cause a deadlock, and both threads will be blocked indefinitely, waiting for a
          resource that will never be released.
         */

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + ": acquired resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + ": acquired resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + ": acquired resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + ": acquired resource1");
                }
            }
        });


        thread1.start();
        thread2.start();


    }
}
