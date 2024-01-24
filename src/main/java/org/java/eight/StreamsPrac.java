package org.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPrac {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person(1, 12, "Someone", "Bangalore"),
                                                new Person(2, 13, "Some other", "Chennai"),
                                                new Person(3, 14, "Shes", "Mumbai"),
                                                new Person(4, 45, "Adv", "Nandi"));

        List<Person> peopleYoungerThan18 = personList.stream().filter(person -> person.getAge() < 18).collect(Collectors.toList());
        System.out.println("People Younger than 18: " + peopleYoungerThan18);

        // People in Bangalore
        List<String> peopleInBangalore = personList.stream().filter(person -> person.getCity().equals("Bangalore")).map(Person::getName).collect(Collectors.toList());
        System.out.println("People In Bangalore: " + peopleInBangalore);

        // Average age of all people
        Double averageAge = personList.stream().mapToDouble(Person::getAge).average().orElse(0.0);
        System.out.println("Average age: " + averageAge);

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "grape"),
                Arrays.asList("watermelon", "melon"),
                Arrays.asList("Kiwi", "Die")
        );

        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);

        List<String> flattenedListUppercase = flattenedList.stream()/*.peek(string -> System.out.println("Peeking " + string)) */.map(String::toUpperCase).toList();
        System.out.println("Upper Case List: " + flattenedListUppercase);

        String concatenatedString = flattenedList.stream()
                .reduce("", (acc, s) -> acc + s);
        System.out.println(concatenatedString);

        Map<Integer, List<String>> groupedByLength = flattenedListUppercase.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("groupedByLength = " + groupedByLength);

        Map<Boolean, List<String>> partitioned = flattenedListUppercase.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println("partitioned = " + partitioned);


        List<List<List<Integer>>> listList = Arrays.asList(Arrays.asList(Arrays.asList(1, 2, 4, 5), Arrays.asList(5, 6, 78)), Arrays.asList(Arrays.asList(1, 2, 4), Arrays.asList(145, 234, 15)));

        System.out.println(listList);
        List<Integer> integerList = listList.stream().flatMap(lists -> lists.stream().flatMap(List::stream)).distinct().filter(n -> n > 10).toList();
        System.out.println("integerList = " + integerList);



    }
}
