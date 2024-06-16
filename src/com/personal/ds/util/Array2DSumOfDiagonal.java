package com.personal.ds.util;

public class Array2DSumOfDiagonal {
    public static void main(String[] args) {
        int input[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i = 0 ; i < input.length; i++){
            for(int j = 0; j< input[i].length; j++){
                if(i==j){
                    sum = sum+input[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonals:"+sum);
        int total = 0;
        for(int i = 0; i < input.length;i++){
            total = total + input[i][i];
        }
        System.out.println("Total:"+total);

        }
    }
