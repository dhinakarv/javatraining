package com.ice.controller.demo;

public class FunctionalInterface1Impl implements FunctionalInterface1 {
    @Override
    public String greet() {
       // System.out.println("Greeted through Override");
        return "Override";
    }

    public static void main(String[] args) {
        FunctionalInterface1Impl fi1 = new FunctionalInterface1Impl();
        System.out.println(fi1.greet());
    }
}

//1 1 --> T is input, return E
//10 --> T is input , output would be void
//01 --> no input, return T as output
//00 --> no input, void return

//Predicate
//Supplier
//consumer
//Function

