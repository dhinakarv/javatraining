package com.personal.ds.util;

import com.personal.datastructure.StackImpl;

public class StringReverse {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(10);
        String input = "Dhinakar";
        for(char c : input.toCharArray()){
            stack.push(c);
        }

        stack.printElements();
        System.out.println();

        for(char c : input.toCharArray()){
            stack.pop();
        }
    }
}
