package org.java.programs;

public class Simple {
    static void m1() {
        System.out.print("Foo");
    }
}

class Child extends Simple {
    static void m1() {
        System.out.print("Bar");
    }

    public static void main(String... args) {
        Simple obj = new Child();
        obj.m1();
    }
}