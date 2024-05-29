package com.ice.controller.demo;

public class FunctionalInterfaceImpl {
    public static void main(String[] args) {
        FunctionalInterfaceDemo f1 = new FunctionalInterfaceDemo() {
            @Override
            public String getData(String user) {
                return user+": Anonymous";
            }
        };

        System.out.println(f1.getData("Mahesh"));

        FunctionalInterfaceDemo f2 = (user->{
                return user+": Lambda way";
            });
        System.out.println(f2.getData("Mahesh"));

        FunctionalInterfaceDemo f3 = (user-> user+": Lambda way");
        System.out.println(f3.getData("Mahesh"));

        FunctionalInterface2 i1 =()-> {    // lambda expression
            System.out.println("Dhinakar");
           return "Dhinakar";
        };
        i1.getData();
    }

    FunctionalInterface2 i2 = ()->"Dhinakar";




}


