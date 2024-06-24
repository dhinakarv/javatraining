package com.personal.gs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LargestUniformSubString {
    public static void main(String[] args) {
        System.out.println(rle("aaaadbbccaae"));
        System.out.println(firstUniqueChar("apple"));
        System.out.println(maxSubStringNonRepeating("abddefgh"));
        System.out.println(pangram("abcedfg"));
    }

    private static boolean pangram(String test) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        HashSet<Character> hs = new HashSet<>();
        for(char c: alpha.toCharArray()){
            hs.add(c);
        }
        System.out.println(hs);
        for(char c: test.toCharArray()){
            hs.remove(c);
        }
        System.out.println(hs);

        return false;
    }

    private static String firstUniqueChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else
                hm.put(c, 1);
        }
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()==1){
                sb.append(e.getKey());
                break;
            }
        }

        return sb.toString();
    }

    public static String maxSubStringNonRepeating(String input){
        String out ="";
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int stat =0,end=0; end< input.length(); end++) {
            char curr = input.charAt(end);
            if(hm.containsKey(curr)){
                stat = Math.max(hm.get(curr)+1,stat);
            }
            if(out.length()<end-stat+1){
                out = input.substring(stat, end+1);
            }
            hm.put(curr,end);
        }
        return out;
    }

    private static String rle(String s) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else {
                sb.append(s.charAt(i));
                sb.append(count);
                count=1;
            }
        }
        return sb.toString();
    }


}
