package com.personal.gs;

public class StringReverse {

    public static void main(String[] args) {
        String s1 = "Dhinakar";
        StringBuffer sb = new StringBuffer();
        for(int i = s1.length()-1; i >=0; i--){
            sb.append(s1.charAt(i));
        }
        System.out.println(sb);
    }
}
