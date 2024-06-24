package com.personal.gs;

public class PowerExponential {
    public static void main(String[] args) {
        System.out.println(powerOf(50,-2));
    }

    private static double powerOf(int base, int exp) {
        if (base==0) return 0;
        if(base==1) return 1;
        if(exp==1) return base;
        int positiveExp =exp < 0? exp*-1: exp;
        double result = positiveExp%2==0? powerOf(base*base,positiveExp/2):powerOf(base*base,positiveExp-1/2);
        return result;
    }
}
