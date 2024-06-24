package com.personal.gs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestInArray {
    public static void main(String[] args) {
        int a[]={4,6,3,8,2};
        int small= Integer.MAX_VALUE;
        int nextSmall=Integer.MAX_VALUE;

       /* for(int i = 0; i < a.length; i++){
            if(small> a[i]){
                small = a[i];
            }
        }

        for(int i = 0; i < a.length; i++){
            if(nextSmall> a[i] && a[i]> small){
                nextSmall = a[i];
            }
        }*/

       /* for(int i=0; i< a.length; i++){
            if(a.length>1){
                if(small> a[i]){
                    nextSmall = small;
                    small=a[i];
                }
                else if (nextSmall > a[i]){
                    nextSmall=a[i];
                }
            }
            else{
                small=a[i];
                nextSmall=a[i];
            }
        }*/

        int small1 = Integer.MAX_VALUE;
        int secSmall1 = Integer.MAX_VALUE;
        for(int i =0; i < a.length; i++){
            if(small1>a[i]){
                secSmall1 = small1;
                small1 = a[i];
            }else if (secSmall1> a[i]){
                secSmall1 = a[i];
            }
        }

        System.out.println(small1+":Second Small:"+secSmall1);
        Arrays.sort(a);
        int[] l1  = Arrays.stream(a).sorted().limit(2).toArray();
    }
}
