package com.personal.datastructure;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        JavaArray j1 = new JavaArray();
        a[4]=500;
        //a[6]=8;

        System.out.println("Sum:"+j1.sum(a));

        for (int i=0; i< a.length;i++){
           a[i]=100+i;
            System.out.println(a[i]);
        }
        for(int i = a.length-1; i>=5; i--){
            if(i == 5){
                a[i]=6000;
            }
        }
         System.out.println("-----");
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        int b[][] = {{1,2,3,4},{4,5,6},{7,8,9}};



        for(int i =0; i< b.length;i++){
            for(int j = 0; j < b[i].length; j++ ){
                System.out.println(b[i][j]);
            }
        }
    }

    public int sum(int a[]){
        /*int sumOfArray=0;
        for(int i = 0; i< a.length; i++){
            sumOfArray= sumOfArray+ a[i];
        }
        return sumOfArray;*/
        Arrays.stream(a).map(a1->a1*a1).forEach(i->System.out.println("Square:"+i));
       int c= Arrays.binarySearch(a,3);
       System.out.println("found:"+c);
        return Arrays.stream(a).sum();

    }
}
