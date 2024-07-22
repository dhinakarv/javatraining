package com.personal.ds.util.array;

import java.util.Arrays;
import java.util.HashMap;

public class Array12High {
    public static void main(String[] args) {
        int[] input ={204,100,200,5,6,700,120};
        findDup(input);

        int first=0,second=0;
        for(int i : input){
            if(i> first){
                second = first;
                first = i;
            }
            else if(i > first && i < second){
                second = i;
            }
        }
        System.out.println("First:"+first+":Second:"+second);


        System.out.println("Count Steps:"+countSteps(10));

    }

    private static void findDup(int[] ints) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < ints.length; i++){
            if(hm.containsKey(i)){
                System.out.println(ints[i]);
                hm.put(ints[i], hm.get(i)+1);
            }
            else{
                System.out.println("else:"+ints[i]);
                hm.put(ints[i],1);
            }
        }
        System.out.println("OUTPUT:"+hm);
    }


    private static int countSteps(int i) {
        if(i == 0 )return 0;
        if(i ==1) return 1;
        if(i==2) return 2;
        if(i==3) return 4;
        int out=0;
        for(int n =4; n <=i; n++){
            out= countSteps (n-1)+countSteps(n-2)+countSteps(n-3);
        }
        return out;

    }
}
