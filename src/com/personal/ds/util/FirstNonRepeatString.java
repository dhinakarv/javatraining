package com.personal.ds.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatString {

    public static void main(String[] args) {
        String input = "DhinDakar";
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else
                hm.put(c, 1);
        }
        System.out.println(hm);
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("The first Non Repeating Character in String:" + e.getKey());
                break;
            }
        }
    /*    char c =input.chars()
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(a->a.getValue()==1)
                .findFirst()
                .map(Map.Entry::getKey).get();
        System.out.println("Non Repeat Char through stream:"+c);*/

        char c = input.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).findFirst().map(Map.Entry::getKey).get();
        System.out.println("Non Repeat Char through stream:" + c);

    }
}
