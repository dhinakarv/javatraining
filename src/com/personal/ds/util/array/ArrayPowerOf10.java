package com.personal.ds.util.array;

public class ArrayPowerOf10 {
    public static void main(String[] args) {
        System.out.println("Input 1000 is power of 10?:" + powerOf10(3000));

    }

    public static boolean powerOf10(int inp) {
        boolean power = false;
        for (int i = 1; i <= inp; i *= 10) {
            if (i == inp) {
                power = true;
            }
        }
        return power;
    }
}