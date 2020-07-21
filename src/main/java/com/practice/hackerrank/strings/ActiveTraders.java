package com.practice.hackerrank.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActiveTraders {
    public static void main(String[] args) {
        List<String> customers = new ArrayList<>();

        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");
        customers.add("Alpha");

        customers.add("Omega");
        customers.add("Omega");
        customers.add("Omega");
        customers.add("Omega");
        customers.add("Omega");
        customers.add("Omega");
        customers.add("Omega");
        customers.add("Omega");
        customers.add("Omega");

        customers.add("Beta");

        int n = customers.size();

        Map<String, Integer> customerToCountOfTrades = new HashMap<>();

        customers.forEach( c -> customerToCountOfTrades.put(c, customerToCountOfTrades.getOrDefault(c, 0) + 1));

        List<String> res = customerToCountOfTrades.keySet().stream().filter( c -> customerToCountOfTrades.get(c)*100/n >= 5).sorted().collect(Collectors.toList());
        res.forEach(System.out::println);

    }
}
