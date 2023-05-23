package org.java.singleton.org.java.simple;

public class SomeCass {

    public static void main(String[] args) throws InterruptedException {
        SomeCass someCass = new SomeCass();
        someCass = null ;
        System.gc();
        Thread.sleep(1000);
    }
}