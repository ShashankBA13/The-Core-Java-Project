package org.java;

public class ThreadCreation implements Runnable{
    @Override
    public void run() {
        System.out.println("In the run method");
    }

    private static void main(String[] args) {
        
        for (int i = 1; ; i --) {
            System.out.println("i = " + i);
        }
    }
}
