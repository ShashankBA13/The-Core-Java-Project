package org.java.oop.polymorphism.runtime;

public class Animal {

    void makeSound() {
        System.out.println("Animal is makin a sound");
    }
}

class Dog extends Animal {

//    @Override
//    void makeSound() {
//        System.out.println("Woof, Woof!!! \uD83D\uDC36 \uD83D\uDC15");
//    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow, Meow!!! \uD83D\uDC08\u200D \uD83D\uDC31");
    }
}
