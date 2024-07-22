package com.personal.ds.util;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class StreamConcurrencyTEst {
    public static void main(String[] args) {
        CopyOnWriteArrayList a = new CopyOnWriteArrayList();
        for(int i = 0; i <=10; i++){
            a.add(i);
        }
        a.stream().map(i-> (int)i*10).forEach(i-> {
            System.out.println(i);
            a.add(i);
        });
        System.out.println("Number of ForkJointPool threads:"+
                System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism"));
        System.out.println("Here:"+a);
    }
}
