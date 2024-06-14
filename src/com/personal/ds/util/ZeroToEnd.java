package com.personal.ds.util;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Collections.swap;

public class ZeroToEnd {


    public static void main(String[] args) {

        int A[]={1,0,9,0,8,0,7,6,0,6,5,0,2};
        int j = 0;
        for (int i =0; i < A.length; i++){
         if( A[i]!=0){
             swapint(A, j , i);
             j++;
         }
        }
        Arrays.stream(A).forEach(System.out::print);

    }

    private static void swapint(int[] a, int j, int i) {
        int temp = a[j];
        a[j]=a[i];
        a[i]=temp;
    }
}
