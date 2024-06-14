package com.personal.validation.demo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {

    public static void main(String[] args) {
        Map<Integer, Integer> map1 = Map.of(1,3,5,2,0,1,4,5,3,4);
        map1.entrySet().stream().forEach(System.out::println);

        Map<Integer,Integer> map2 = map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)-> a, LinkedHashMap::new));

        System.out.println("Sorted using values:"+map2);

        List<List<Integer>> l1 = List.of(List.of(1,2), List.of(3,4));

       List l2 =  l1.stream().flatMap(Collection::stream).toList();
       l1.stream().forEach(System.out::println);

    }
}
