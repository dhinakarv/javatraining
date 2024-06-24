package com.personal.gs;

public class ShortDistanceBetweenStrings {
    public static void main(String[] args) {
        System.out.println(shortDistance("This is a sample document we just made up","we","made"));
    }

    private static double shortDistance(String s, String s1, String s2) {
        double s1Location = 0;
        double s2Location = 0;
        int index = 0;
        double shortDist = s.length();
        for(String word: s.split(" ")){
            if(word.toLowerCase().equals(s1)){
                s1Location = index+s1.length()/2;
            } else if (word.toLowerCase().equals(s2)){
                s2Location = index+s2.length()/2;
            }
            if(s1Location> 0 && s2Location> 0){
                double curr = Math.abs(s2Location-s1Location);
                if(curr>shortDist){
                    shortDist=curr;
                }
            }
            if(s1Location<= 0 || s2Location<= 0){
                shortDist = -1;
            }
            index = index+word.length()+1;
        }


        return shortDist;
    }
}
