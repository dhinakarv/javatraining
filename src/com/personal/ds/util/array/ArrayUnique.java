package com.personal.ds.util.array;

public class ArrayUnique {
    public static void main(String[] args) {
        System.out.println("Is Array Unique:"+isUnique(new int[]{1, 5,2, 3, 4, 5, 6}));
        System.out.println("Is Array Permutation Unique:"+isPermutation(new int[]{1, 5,2, 3, 4, 5, 6},new int[]{3, 5,2, 6, 4, 5, 1}));
    }
    public static boolean isUnique(int[] intArray) {
        boolean unique = true;
        for(int i =0; i< intArray.length;i++){
            for(int j = i+1; j< intArray.length; j++){
                if(intArray[i]==intArray[j]){
                    unique = false;
                }
            }
        }
        return unique;
    }

    public static boolean isPermutation(int arr1[], int arr2[]) {
       if(arr1.length!=arr2.length) return false;
       int sum1=0,sum2=0,mul1=0,mul2=0;
       for(int i = 0; i< arr1.length; i++){
           sum1+=arr1[i];
           sum2+=arr2[i];
           mul1+=arr1[i];
           mul2+=arr2[i];
        }
       return sum1==sum2 &&mul1==mul2?true:false;
    }
}
