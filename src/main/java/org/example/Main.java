package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Example 1: Filter even numbers and print
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);  // Output: 2, 4

        // Example 2: Map each number to its square and print
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);  // Output: 1, 4, 9, 16, 25
    }
    }
