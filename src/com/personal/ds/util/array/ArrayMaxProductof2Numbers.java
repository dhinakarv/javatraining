package com.personal.ds.util.array;

public class ArrayMaxProductof2Numbers {
    public static void main(String[] args) {
        int input[]={100,200,30,40,50};
        int maxProduct = 0;
        int p=0,q=0;
        for(int i = 0; i< input.length; i++){
            for (int j = i+1; j< input.length; j++){
             if(input[i]*input[j]> maxProduct){
                 maxProduct = input[i]*input[j];
                 p=i;q=j;
             }
            }
        }
        System.out.println(p+":"+q);

    }
}
