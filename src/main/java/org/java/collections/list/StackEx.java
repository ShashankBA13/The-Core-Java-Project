package org.java.collections.list;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("String");
        stack.push("Hello");
        stack.add(1);
        stack.set(2, "Changed");


        System.out.println("Stack: " + stack);

        // Accessing top element
        System.out.println("Top Element: " + stack.peek());

        // Removing an  element
        stack.pop();
        System.out.println("Stack after removing: " + stack);

        // Checking if the stack is empty
        System.out.println(stack.empty());

        // Capacity of the stack
        System.out.println(stack.capacity()); // Output: 10

        // Please explore other methods as well
    }
}