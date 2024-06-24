package com.personal.gs;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueTuples {
    public static void main(String[] args) {
        String s1 ="dhinaa";
        int len=2;
        Arrays.sort(args);
        HashSet set = new HashSet();
        for(int i =0; i< s1.length()-len+1;i++){
            set.add(s1.substring(i,i+len));
        }
        System.out.println(set);
    }
}
