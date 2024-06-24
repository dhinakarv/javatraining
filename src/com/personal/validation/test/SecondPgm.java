package com.personal.validation.test;

import com.personal.validation.demo.FirstProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SecondPgm<K,V> {

    private class Entry<K,V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
        public int capacity = 16;
        java.util.LinkedList<Entry<K,V>>[] list = null;

        public SecondPgm(){
            list = new LinkedList[capacity];
            for(int i = 0; i < capacity; i++){
                list[i] = new LinkedList<>();
            }
        }

        public int hash(K key){
            return Math.abs(key.hashCode()%capacity);
        }

        public void put (K key, V value){
            int index = hash(key);
            LinkedList<Entry<K,V>> bucket = list[index];

            for(Entry<K,V> entry: bucket){
                if(entry.key.equals(key)){
                    bucket.add(new Entry<>(key,value));
                    return;
                }
            }
            bucket.add(new Entry<>(key,value));
        }

        public V get(K key){
            int index = hash(key);
            LinkedList<Entry<K,V>> bucket = list[index];

            for(Entry<K,V> e: bucket){
                if(e.key.equals(key)){
                    return e.value;
                }
            }
            return null;
        }
    public static void main(String[] args) {
        SecondPgm hashMap = new SecondPgm();
        hashMap.put(5,8);
        hashMap.put(7,100);
        System.out.println("Get Value:"+hashMap.get(7));// fp.firstPgmMethod();

        System.out.println("Get NonValue:"+hashMap.get(10));
        SecondPgm hm = new SecondPgm();
        hm.put("Test","Dhina");
        hm.put("t2","Gayu");
        System.out.println("Get Value:"+hm.get("t2"));// fp.firstPgmMethod();

        System.out.println("Baby step Counts:"+countSteps(10));

        System.out.println("Short Distance:"+shortDistance("This is a sample Document we,just-made,up","we","made"));

        System.out.println("Run Length:"+runLength("aaabbcddeeeee"));

        System.out.println("Balanced Bracket:"+balancedBracket("({})"));

        System.out.println("Pivot = left sum + right sum:"+ pivot(new int[]{1,4,2,5},1));
    }

    private static int pivot(int[] a, int n) {
        List<Integer> list
                = Arrays.stream(a).boxed().collect(
                Collectors.toList());        System.out.println(list);
        for (int i = 1; i <= n; i++) {
            int leftSum = list.subList(0, i)
                    .stream()
                    .mapToInt(x -> x)
                    .sum();
            int rightSum = list.subList(i + 1, n)
                    .stream()
                    .mapToInt(x -> x)
                    .sum();

            if (leftSum == rightSum)
                return list.get(i);
        }
        return -1;
    }

    private static int countSteps(int in) {
            if(in==1)return 1;
            if (in==2)return 2;
            if (in==3)return 4;
            int out=0;
            for(int i = 4; i <=in; i++ ){
                out =countSteps(i-1)+countSteps(i-2)+countSteps(i-3);
            }
            return out;
    }

    private static double shortDistance(String doc, String w1, String w2){
            double w1loc= 0;
            double w2loc=0;
            int index=0;
            double shortDist = doc.length();
            String words[]= doc.split(" |-|\\.|,");
        System.out.println("Word[]:"+Arrays.toString(words));

            for(String word: words){
                if(word.toLowerCase().equals(w1)){
                    w1loc = index+w1.length()/2d;
                }else if(word.toLowerCase().equals(w2)){
                    w2loc = index+w2.length()/2d;
                }
                if(w1loc>0 && w2loc > 0){
                    double current = Math.abs(w1loc-w2loc);
                    if(current< shortDist){
                        shortDist = current;
                    }
                }
                index+=word.length()+1;
            }
            if(w1loc ==0 || w2loc == 0){
                shortDist = -1;
            }
            return shortDist;
    }

    public static String runLength(String inp){
            StringBuffer sb = new StringBuffer();
            int count = 1;
            char[] c = inp.toCharArray();
            for(int i = 0; i < c.length; i++){
                char c1 = c[i];
                if(i+1< c.length && c[i]==c[i+1]){
                    count++;
                }else{
                    sb.append(c1);
                    sb.append(count);
                    count=1;
                }
            }
            return sb.toString();
    }

    public static boolean balancedBracket(String inp){
            if(inp==null || inp.length()%2!=0){
                return false;
            }else {
                for (char c : inp.toCharArray()) {
                    if (!(c == '(' || c == '{' || c == '[' || c == ')' || c == '}' || c == ']')) {
                        return false;
                    }
                }
            }
               /* while(inp.contains("(") || inp.contains(")")||inp.contains("{")|| inp.contains("}")|| inp.contains("[")|| inp.contains("]")){
                    inp = inp.replaceAll("\\(","").replaceAll("\\)","")
                            .replaceAll("\\{","").replaceAll("\\}","")
                            .replaceAll("\\[","").replaceAll("\\]","");
                }*/

        while(inp.contains("()") || inp.contains("{}")||inp.contains("[]")){
            inp = inp.replaceAll("\\(\\)","")
                    .replaceAll("\\{\\}","")
                    .replaceAll("\\[\\]","");
        }
                return inp.length()==0;
    }

}



