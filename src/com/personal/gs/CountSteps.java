package com.personal.gs;


public class CountSteps {
    public static void main(String[] args) {
       System.out.println(countSteps(4));
    }

    private static int countSteps(int i) {
        if (i==0) throw new IllegalStateException("Please provide valid input");
        if (i==1) return 1;
        if (i==2) return 2;
        if (i==3) return 4;
        int out=0;
        for(int j=4; j<=i; j++){
            out = countSteps(i - 1) + countSteps(i - 2) + countSteps(i - 3);
        }
        return out;
    }
}
