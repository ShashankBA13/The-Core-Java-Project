package org.java.threads;

public class MultiThreadingSample  extends Thread{

    public void run(){
        System.out.println("Thread with id "+ Thread.currentThread().getId() + " is running");
        System.out.println(Thread.currentThread().getName() + " is running");
        System.out.println();
    }

    public static void main(String[] args) {
       for (int i = 0; i <5; i++) {
           MultiThreadingSample  multiThreading = new MultiThreadingSample();
           multiThreading.start();
       }
    }
}