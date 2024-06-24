package com.personal.ds.util.array;

import java.util.Arrays;

public class ArrayPivotSumofLeftRight {
    public static void main(String[] args) {
        int[] inp = {1,2,3,4,1,1,1};
        int j=1;
        int left[]= new int[inp.length-1];
        int right[]= new int[inp.length-1];
        for(int i =0; i< inp.length-1;i++){
            left[i]=inp[i]+inp[j];
            j++;
        }
        j=inp.length-2;
        for(int i =inp.length-1; i> 1;i--){
            right[i]=inp[i]+inp[j];
            j--;
            System.out.println(right[i]);
        }
        System.out.println(Arrays.toString(left));
    }

}
