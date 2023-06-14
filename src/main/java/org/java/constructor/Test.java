package org.java.constructor;

public class Test {

    int i = 10;

    Test() {
        System.out.println("Test.Test");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }

    void doStuff() {
        System.out.println("Test.doStuff");
    }
}

class Child extends Test {

    int i = super.i;

    Child() {
        super();
        System.out.println("Child.Child");
        super.doStuff();
    }
}