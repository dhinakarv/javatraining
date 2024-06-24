package com.personal.ds.util.array;

import java.util.Arrays;

public class ArrayFirstSecondHigh {
    public static void main(String[] args) {
        int[] scores ={100,85,90,170,120,40,76};
        int first= 0;
        int second = 0;
        for(int score: scores){
            if(score > first) {
                second = first;
                first = score;
            }
                else if (score < first && score > second){
                    second = score;
                }
            }
        int[] fsArray = {first,second};
        Arrays.stream(fsArray).forEach(System.out::println);
    }
    }
