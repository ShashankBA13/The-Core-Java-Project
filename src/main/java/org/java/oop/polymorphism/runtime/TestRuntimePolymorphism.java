package org.java.oop.polymorphism.runtime;

public class TestRuntimePolymorphism {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}