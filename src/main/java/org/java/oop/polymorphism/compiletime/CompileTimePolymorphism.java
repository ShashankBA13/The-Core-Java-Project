package org.java.oop.polymorphism.compiletime;

public class CompileTimePolymorphism {

    // This is a unit converter example for compile time polymorphism

    // Method to convert meters to centimeters
    public static double convertToCentimeters(double meters) {
        return meters * 100;
    }

    // Method to convert inches to centimeters
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    // Method to convert feet to meters
    public static double convertToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        // Compile-time polymorphism in action
        double lengthInCentimeters1 = CompileTimePolymorphism.convertToCentimeters(2.5); // Using double argument
        double lengthInCentimeters2 = CompileTimePolymorphism.convertToCentimeters(12);  // Using int argument
        double lengthInMeters = CompileTimePolymorphism.convertToMeters(10);

        System.out.println("Length in Centimeters 1: " + lengthInCentimeters1);
        System.out.println("Length in Centimeters 2: " + lengthInCentimeters2);
        System.out.println("Length in Meters: " + lengthInMeters);
    }
}
