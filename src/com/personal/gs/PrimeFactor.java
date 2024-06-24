package com.personal.gs;

import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println(primeFactor(1));
    }

    private static ArrayList primeFactor(int factor) {
        ArrayList<Integer> factors = new ArrayList<>();
        if(factor<2){
            return factors;
        }
        for(int i=2;i<=factor;i++){
                if(factor%i==0){
                    factor = factor/i;
                    factors.add(i);
                }
        }
        return factors;

    }
}
