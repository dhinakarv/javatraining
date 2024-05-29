package com.ice.controller.demo;

public class FunctionInterfaceImpl1 {
    public static void main(String[] args) {
        //Option 2: We are not creating a class which implements FI1
        //This is anonymous class
        FunctionalInterface1 fi1 = new FunctionalInterface1(){
           @Override
           public String greet(){
               return "Anonymous";
           }
        };
        System.out.println(fi1.greet());

        FunctionalInterface1 fi2 = ()->"Lambda";
        System.out.println(fi2.greet());






    }
}
