package org.java.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComplexStreamsScenario {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Order> orders = Arrays.asList(
                new Order(1, Arrays.asList(new OrderItem("item1", 10.0), new OrderItem("item2", 15.0))),
                new Order(2, Arrays.asList(new OrderItem("item2", 15.0), new OrderItem("item3", 20.0))),
                new Order(3, Arrays.asList(new OrderItem("item1", 10.0), new OrderItem("item3", 20.0))),
                new Order(4, Arrays.asList(new OrderItem("item4", 30.0), new OrderItem("item5", 25.0))),
                new Order(5, Arrays.asList(new OrderItem("item4", 30.0)))
        );

        // Find all the order Ids where the order items are more than 1
        List<Integer> orderIds = orders
                                    .stream()
                                    .filter(order -> order.getOrderItems().size() > 1)
                                    .map(Order::getOrderId)
                                    .toList();
        System.out.println(orderIds);

        // Find the total sum of individual orders
        Map<Integer, Double> sumOfIndividualOrders = orders
                                                        .stream()
                                                        .collect(
                                                            Collectors
                                                                    .toMap(
                                                                        Order::getOrderId,
                                                                        order -> order.getOrderItems().stream().mapToDouble(OrderItem::getPrice).sum()
                                                        ));
        System.out.println("sumOfIndividualOrders = " + sumOfIndividualOrders);

        // Streams with consumer

        Consumer<Map<Integer, Double>> something = map -> {
            map.replaceAll((k, v) -> v +  1.2);
//            map.forEach((key, value) -> System.out.println(key + " " + value));
        };

        something.accept(sumOfIndividualOrders);

        Map<Integer, Order> orderMap = orders.stream().collect(Collectors.toMap(Order::getOrderId, Function.identity()));
//        System.out.println(orderMap);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 6);
        Optional<Integer> sum1 = numbers1.stream().reduce(Integer::sum);
        System.out.println(sum1.get());

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Hello").thenApply(s -> s + " World").thenAccept(System.out::println);
        future.get();

    }
}
