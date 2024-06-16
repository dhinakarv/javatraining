package com.personal.ds.util;

import java.util.Arrays;

public class ArrayRemoveDuplicatesFindLength {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,4};
        int j=1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
            }
        }
        System.out.println("Length of Unique values in this sorted array:"+j);
        int[] nums1={4,2,5,1,5,2,2,3,3,4};
        int length = Arrays.stream(nums1).distinct().toArray().length;
        System.out.println("Using Streams:"+length);
    }
}
