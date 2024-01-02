package org.java.oop.composition;

public class Test {
    public static void main(String[] args) {
        Container container = new Container();
        container.doSomething();
        container.getContained().doSomething();
    }
}