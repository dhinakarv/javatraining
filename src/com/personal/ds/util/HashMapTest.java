package com.personal.ds.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        h1.put(1,1);
        h1.put(1,2);
        h1.put(2,2);
        System.out.println(h1);

        List<Integer> l1 = Arrays.asList(1,2,3,4);
        l1.stream().mapToInt(i-> i).filter(i->i%2==0).forEach(System.out::println);
        System.out.println("Addition:"+l1.stream().mapToInt(i->i).sum());

        Map<Boolean, List<Integer>> h2 = l1.stream().collect(Collectors.partitioningBy(n -> n%2==0));
        System.out.println(h2);
    }
}
