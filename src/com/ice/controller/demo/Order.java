package com.ice.controller.demo;

public interface Order {
    int i =100;
    //public final
    //public
    public String m1();

    default int addition(int i, int j){
        return i+j;
    }

    static int sub(int i, int j){
        return i-j;
    }




    //2 types of method
    //1. Default Method
    //2. Static Method


}
