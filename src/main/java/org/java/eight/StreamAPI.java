package org.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Hola", "Caio", "Salut", "Bonjour", "");

        System.out.println(list);

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach((i) -> System.out.println("Hola" + i + "\n")); // Won't print anything

        Consumer<String> consumer = s -> System.out.println(s);
        streamOfList(Arrays.asList("Hello", "Hii", "Senor")).forEach(consumer);

        // Stream of a collection
        Stream<String> stringStream = list.stream();
        stringStream.forEach((i) -> System.out.println(i));

        // Stream of an array
        Stream<Integer> integerStreamArray = Stream.of(1, 3, 5, 8, 873, 0111111 /* This is an octal number */);
        integerStreamArray.forEach(System.out::println); // Method Reference

        Stream<String> streamBuilder =
                Stream.<String>builder().add("String ").add("Integer ").add("Float ").add("Double ").add("Boolean ").build();
        streamBuilder.forEach(System.out::print); // Method Reference
        System.out.println();

        /*The generate() method accepts a Supplier<T> for element generation.
        As the resulting stream is infinite, the developer should specify the desired size,
        or the generate() method will work until it reaches the memory limit.
        */
        // Generates the number 5 times
        Stream<Integer> streamGenerated = Stream.generate(() -> 10).limit(5);
        streamGenerated.forEach(System.out::println);

        Stream<Integer> streamIterated = Stream.iterate(1, n -> n * 2).limit(10);
        streamIterated.forEach(System.out::println); // Output: 1 2 4 8 16 32 64 128 256 512

        /* Stream provides a lot of other functions. Please check the following article for more:
         * https://www.baeldung.com/java-8-streams */

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3, 10, 20);
        doubleStream.forEach(System.out::println);

        IntStream streamOfChars = "Shashank".chars();
        streamOfChars.forEach(System.out::println);

        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");
        streamOfString.forEach(System.out::println);

        List<String> lisojnt = Arrays.asList("abc1", "abc2", "abc3");
        Stream<?> size = lisojnt.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted();
        size.forEach(System.out::println);

        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> collectorCollection =
                productList.stream().map(Product::getName).collect(Collectors.toList());
        System.out.println(collectorCollection);

        String listToString = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(listToString);

//        double avgId = productList.stream().map(Product::getName).collect(Collectors.averagingInt(Product::getI));
    }

    public static Stream<String> streamOfList(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
