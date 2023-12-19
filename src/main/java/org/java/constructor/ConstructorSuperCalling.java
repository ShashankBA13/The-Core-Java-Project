package org.java.constructor;

import java.util.Arrays;

public class ConstructorSuperCalling {

    public static void main(String[] args) {
        new B(1);

        String s = "Shashank";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}

class A {

    A() {
        System.out.println("A class's constructor");
    }

    A(int i) {
        System.out.println(i);
    }
}

class B extends A {
    B(int i) {
        System.out.println("B class's constructor");
    }
}