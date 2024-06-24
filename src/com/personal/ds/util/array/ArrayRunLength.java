package com.personal.ds.util.array;

public class ArrayRunLength {
    public static void main(String[] args) {
        System.out.println("Run Length:"+runLength("abbbacc"));
    }

    private static String runLength(String inp) {
        StringBuffer result = new StringBuffer();
        int count =1;
        char[] c=inp.toCharArray();
        char current;
        for(int i = 0; i < c.length; i++){
            if(i+1<c.length && c[i]==c[i+1]) {
                count++;
            }else{
                result.append(c[i]);
                result.append(count);
                count=1;
            }

            }
        return result.toString();

    }

}
