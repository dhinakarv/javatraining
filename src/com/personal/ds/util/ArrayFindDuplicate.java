package com.personal.ds.util;

import java.util.HashMap;

public class ArrayFindDuplicate {

    public static void main(String[] args) {
        int[] input ={1,2,3,3,4,4,5,6,7,5,4};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0; i<input.length;i++){

            if(hm.containsKey(input[i])){
                hm.put(input[i],hm.get(input[i])+1);
            }
            else{
                hm.put(input[i],1);
            }
        }
        hm.entrySet().stream().filter(i->i.getValue()>1).forEach(System.out::println);
    }
}
