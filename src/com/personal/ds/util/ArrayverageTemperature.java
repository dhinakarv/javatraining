package com.personal.ds.util;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayverageTemperature {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How may day's Temparature");
        int numberOfDays = console.nextInt();
        double avg;
        int sum = 0;
        int[] a = new int[numberOfDays];
        for (int i = 0; i < numberOfDays; i++){
            System.out.println("Day "+i+ " Temperature");
            int temp = console.nextInt();
            a[i]=temp;
            sum=sum+temp;
        }
        avg = sum/numberOfDays;
        System.out.println("Avg Temp:"+ avg);

        for(int i=0; i< a.length;i++){
            if(a[i] > avg) {
                System.out.println("Day's Temp more than average:" + a[i]);
            }
        }
        Arrays.stream(a).filter(i->i> avg).
                forEach(i->System.out.println("Number of days more than average:"+i));
    }
}
