package com.personal.ds.util.array;

public class ArrayShortestDistancebtwWords {
    public static void main(String[] args) {
        System.out.println("Found Shortest Distance:"+
                shortDist("This is a sample document we just made up","we","made"));
    }

    public static double shortDist(String doc, String word1, String word2){

        int index=0;
        char c1[] = {',',' ','|'};
        String words[] = doc.split(" ");
        double word1loc = 0;
        double word2loc = 0;
        double shortest = doc.length();
        for(String word: words){
            System.out.println(word);
            if(word.equals(word1)){
                System.out.println("Found word1");
                word1loc = index + word.length()/2;
            }
            else if(word.equals(word2)){
                System.out.println("Found word2");
                word2loc = index + word.length()/2;
            }
            if(word1loc > 0 && word2loc >0){
                double curr = Math.abs(word1loc - word2loc);
                if(curr < shortest){
                    shortest = curr;
                }
            }
            index += word.length()+1;

        }
        if (word1loc==0 || word2loc==0){
            return -1;
        }

        return shortest;
    }
}
