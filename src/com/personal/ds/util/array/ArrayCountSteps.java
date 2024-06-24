package com.personal.ds.util.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayCountSteps {
    public static void main(String[] args) {
        System.out.println("Child can climb in these permutations:"+countSteps(10));
    }

    private static int countSteps(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        if (n==3) return 4;
        ArrayList<Integer> count = new ArrayList<>();
        count.add(0);
        count.add(1);
        count.add(2);count.add(4);

        for(int i=4; i<=n; i++){
            count.add(count.get(i-1)+count.get(i-2)+count.get(i-3));
            System.out.println(count);

        }
        return count.get(n);
    }
}
