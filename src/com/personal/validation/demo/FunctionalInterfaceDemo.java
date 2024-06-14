package com.personal.validation.demo;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    String getData(String user);

    default String getMessage(){
        return "ab";
    }

    static String getMessage1(){
        return "ab";
    }

}
