package org.java.eight;

public interface Interface {
    static void doStuff() {
        System.out.println("Interface.doStuff a static method");
    }

    void print(int i);

    //Default methods
    default void hello() {
        System.out.println("Interface.hello");
    }
}
