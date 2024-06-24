package com.personal.gs;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(findSquareRootOf(620));
    }

    private static double findSquareRootOf(int i) {
        double t;
        double sqRoot = i/2;
        do{
            t= sqRoot;
            sqRoot = (t + (i/t))/2;
        }while ((t-sqRoot)!=0);
        return t;
    }
}
