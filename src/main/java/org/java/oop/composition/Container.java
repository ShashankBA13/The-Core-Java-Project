package org.java.oop.composition;

public class Container {

    public Contained contained;

    public Container() {
        this.contained = new Contained();
    }

    public Contained getContained() {
        return contained;
    }

}

class Contained {
    void doSomething() {
        System.out.println("Hello from doSomething");
    }

}