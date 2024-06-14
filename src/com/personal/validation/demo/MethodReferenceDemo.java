package com.personal.validation.demo;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);

        numbers.forEach(System.out::println);


        numbers.stream().sorted((a, b) -> a.compareTo(b));
        numbers.stream().sorted(Integer::compareTo);

        numbers.stream().sorted(Integer::compareTo).forEach(System.out::println);

    }
}
