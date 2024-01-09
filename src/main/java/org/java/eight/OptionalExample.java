package org.java.eight;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Product product = new Product(1, null);
        Optional<String> optional = Optional.ofNullable(product.getName());

        //Before Java8
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Unknown");
        }


        String name = optional.orElse("Unknown");
        System.out.println("name = " + name);
    }
}