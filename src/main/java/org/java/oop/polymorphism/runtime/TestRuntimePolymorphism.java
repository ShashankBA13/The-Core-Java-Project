package org.java.oop.polymorphism.runtime;

public class TestRuntimePolymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
