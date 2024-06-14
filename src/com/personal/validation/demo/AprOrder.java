package com.personal.validation.demo;

public abstract class AprOrder implements Order{
    @Override
    public String m1() {
        System.out.println(i);
        return "m1 from Apr Order";
    }

    public abstract String m2();


}
