package com.personal.ds.util.array;

public class ArrayUniqueChars {
    public static void main(String[] args) {
        String s1 = "abbbccadefdef";
        char[] c1 = s1.toCharArray();
        char[] c2 = new char[c1.length];
        for(int i = 0; i < c1.length; i++){
            for(int j=i+1; j < c1.length; j++){
                if(c1[i]==c1[j]){
                //c2[i]=c//
                }
            }
        }
    }
}
