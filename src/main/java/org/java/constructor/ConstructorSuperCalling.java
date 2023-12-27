package org.java.constructor;

import java.util.Arrays;

public class ConstructorSuperCalling {

    public static void main(String[] args) {
        new B(1);

        String s = "SOMEONE";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}

class A {

    A() {
        this(10);
        System.out.println("A class's constructor");
    }

    A(int i) {
        System.out.println(i);
    }

    {
        System.out.println("A.instance initializer");
    }

    static {
        System.out.println("A.static initializer");
    }

}

class B extends A {
    B(int i) {
        System.out.println("B class's constructor");
    }
}