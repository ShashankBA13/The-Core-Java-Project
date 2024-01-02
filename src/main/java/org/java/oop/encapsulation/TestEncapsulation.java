package org.java.oop.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Kakarot");
        encapsulation.setAge(1020);

        System.out.println("Encapsulation.name: " + encapsulation.getName());
        System.out.println("Encapsulation.age: \t"  + encapsulation.getAge());
    }
}
