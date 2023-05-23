package org.java.singleton;

public class TestDCLSingleton {

    public static void main(String[] args) {
        DCLSingleton singleton = DCLSingleton.instance();
        DCLSingleton singleton1 = DCLSingleton.instance();

        for(;;) {
            System.out.println("Hello");
        }

    }
}

