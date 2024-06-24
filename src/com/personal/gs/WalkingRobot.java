package com.personal.gs;

import java.util.Arrays;
import java.util.HashSet;

public class WalkingRobot {
    public static void main(String[] args) {
        System.out.println("Walk:"+ Arrays.toString(walkRobo("UUUUUUUUU")));
    }



    private static Integer[] walkRobo(String path) {
        Integer[] out = {0,0};
        if( path.length()==0){
            return out;
        }
        if(path==null){
            throw new IllegalStateException("Null Input passed ");
        }
        for(char c: path.toCharArray()){
            switch(c){
                case 'U': out[1]+=1; break;
                case 'D': out[1]-=1; break;
                case 'L': out[0]+=1; break;
                case 'R': out[0]-=1; break;
                default : break;
            }
        }
        return out;


    }
}
