package com.personal.ds.util;

import java.util.Arrays;

public class ArrayMiddleValues {
    public static void main(String[] args) {
        ArrayMiddleValues m  = new ArrayMiddleValues();
        int input[]={1,2,3,4,5};
        int output[]= m.findMiddle(input);
        System.out.println("Middle Values in Array:"+Arrays.toString(output));
        int b[]= Arrays.stream(input).skip(input.length-1).toArray();
        System.out.println("Middle Values in Array:"+Arrays.toString(b));


    }

    private int[] findMiddle(int[] input) {
        int[] output = new int[input.length-2];
        for(int i = 1; i< input.length-1;i++){
            output[i-1]=input[i];
        }
        return output;
    }
}
