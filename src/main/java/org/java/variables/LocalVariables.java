package org.java.variables;

import java.util.Arrays;

public class LocalVariables {

    /**
     * In Java, variables come in two main types: primitive and reference.
     *
     * 1. Primitive Types:
     *    - int: 4 bytes
     *    - double: 8 bytes
     *    - char: 2 bytes
     *    - boolean: 1 byte
     *    - byte: 1 byte
     *    - short: 2 bytes
     *    - long: 8 bytes
     *    - float: 4 bytes
     *    - Hold simple, single values.
     *
     * 2. Reference Types:
     *    - Encompass objects and arrays.
     *    - Store references to complex data structures.
     *
     * Understanding the distinction between these types and their sizes is crucial for effective Java programming.
     */

    public static void main(String[] args) {

        // Both the reference(localPrimitiveVariable) and the value are stored in stack memory
        int localPrimitiveVariable = 10;
        System.out.println("localPrimitiveVariable = " + localPrimitiveVariable);

        // The reference(sayHello) is stored in stack, String object in HEAP
        String sayHello = "Hello, World!!!";
        System.out.println("sayHello = " + sayHello);

        // The reference variable is i.e. array is stored in stack
        // and array elements are stored in heap
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));
        // byte
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte Value = " + minByteValue + ", Max byte value = " + maxByteValue);

        // short
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Min short value = " + minShortValue + ", Max short value = " + maxShortValue);

        // int
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Min int value = " + minIntValue + ", Max int value = " + maxIntValue);

        // long
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Min long value = " + minLongValue + ", Max long value = " + maxLongValue);

        // float
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Min float value = " + minFloatValue + ", Max float value = " + maxFloatValue);

        // double
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min double value = " + minDoubleValue + ", Max double value = " + maxDoubleValue);

        // char
        char minCharValue = Character.MIN_VALUE;
        char maxCharValue = Character.MAX_VALUE;
        System.out.println("Min char value = " + minCharValue + ", Max char value = " + maxCharValue);
        System.out.println("Min char value = " + (int)minCharValue + ", Max char value = " + (int)maxCharValue);

        // boolean
        boolean trueValue = Boolean.TRUE;
        boolean falseValue = Boolean.FALSE;
        System.out.println("trueValue = " + trueValue + ", falseValue = " + falseValue);
    }
}
