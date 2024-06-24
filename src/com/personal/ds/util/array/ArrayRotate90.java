package com.personal.ds.util.array;

import java.util.Arrays;

public class ArrayRotate90 {
    public static void main(String[] args) {
        int[][] inputs = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input Array:"+Arrays.deepToString(inputs));
        int n = inputs.length;
        for(int i=0; i<n; i++ ){
            for(int j = i; j < n; j++){
                System.out.println(inputs[i][j]);
                int temp =inputs[i][j];
                inputs[i][j]=inputs[j][i];
                inputs[j][i]=temp;
            }
        }
        System.out.println("After Transposing Array:"+Arrays.deepToString(inputs));

        for (int i=0; i< n; i++){
            int high= n-1;
            int low = 0;
            while (low<high){
                int temp =inputs[i][low];
                inputs[i][low]=inputs[low][high];
                inputs[i][high]=temp;
                high--;
                low++;
            }
        }
        System.out.println("After 90 degree Array:"+Arrays.deepToString(inputs));

    }
}
