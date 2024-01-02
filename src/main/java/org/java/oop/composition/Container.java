package org.java.oop.composition;

public class Container {

    private final Contained contained;

    public Container() {
        this.contained = new Contained();
    }

    public Contained getContained() {
        return contained;
    }

    void doSomething() {
        System.out.println("Container.doSomething");
    }

}