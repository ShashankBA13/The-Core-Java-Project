package org.java.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

    public static void main(String[] args) {
        Vector vector = new Vector();
        // Adding the elements to the vector
        vector.add(1);
        vector.add("Hello");
        vector.add(3D);
        vector.add(65f);
        vector.addElement(12);

        // Accessing the elements of the vector
        System.out.println(vector.get(3));

        //Removing the elements of the vector
        vector.remove(1);
        vector.remove(Integer.valueOf(1));
        System.out.println(vector);

        // Checking if the element exists
        if(vector.contains(3.0))
            System.out.println("vector contains 3.0");

        // Printing the values using Enumerator
        Enumeration<?> enumerator = vector.elements();
        while (enumerator.hasMoreElements())
            System.out.println(enumerator.nextElement());

        // Size & Capacity
        System.out.println("Size: " + vector.size()); // Output: 2
        System.out.println("Capacity: " + vector.capacity()); // Output: 10

        vector.ensureCapacity(20);
        System.out.println("Capacity: " + vector.capacity()); // Output: 20

        vector.clear();// Clears the whole vector
        System.out.println(vector);// Output: []

        // Some other methods are also there. Please explore further
    }
}