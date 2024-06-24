package com.personal.validation.demo;

import java.util.*;

public class MyHm<K,V>{
    public static void main(String[] args) {
        MyHm<Integer,Integer> hm = new MyHm<>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(2,200);

        System.out.println(hm.hash(300));
        System.out.println(hm.get(2));
        System.out.println("Is Value power of 10:"+powerof10(1000));
        System.out.println("Count for n steps:"+countSteps(10));
        System.out.println("Short Distance between given words:"+shortDist("This is a simple document we just made up","we", "made" ));

        System.out.println("Run Length:"+runLength("aaabba"));

        System.out.println("Factorial:"+factorial(3));
        pascalTriangle(5);
    }
    private class Entry<K,V>{
         K key;
         V value;

        Entry(K key, V value){
            this.key= key;
            this.value = value;
        }

        public final String toString() { return key + "=" + value; }


    }
    public int capacity = 100;
    public LinkedList<Entry<K,V>>[] list;

    public MyHm(){
        list = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++){
            list[i] = new LinkedList<>();
        }
    }

    public int hash(K key){
        return Math.abs(key.hashCode()%capacity);
    }

    public void put(K key, V value){
        int index = hash(key);
        LinkedList<Entry<K,V>> bucket = list[index];

        for(Entry<K,V> e: bucket){
            if(e.key.equals(key)){
                e.value = value;
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




    public static boolean powerof10(int input){
        boolean pwd= false;
        for(int i =1; i<=input; i*=10){
            if(i==input){
                pwd= true;
            }
        }
        return pwd;
    }

    public static int countSteps(int n){
        if (n<=0) return 0;
        if(n==1) return 1;
        if (n==2) return 2;
        if (n==3) return 4;
        List<Integer> count = new ArrayList();
        count.add(0);
        count.add(1);
        count.add(2);
        count.add(4);
        for(int i=4; i <=n; i++){
            count.add(count.get(i-1)+count.get(i-2)+count.get(i-3));
            System.out.println("Counts for each steps:"+count);
        }
        return count.get(n);

    }

    public static double shortDist(String doc, String w1, String w2){
        int index=0;
        double w1Location=0;
        double w2Location=0;
        double shortest=doc.length();
        for(String word: doc.split(" ")){
            if(word.toLowerCase().equals(w1)){
                System.out.println("Found w1:"+w1);
                w1Location = index + w1.length()/2d;

            }else if(word.toLowerCase().equals(w2)){
                System.out.println("Found w2:"+w2);
                w2Location = index + w2.length()/2d;
            }
            if(w1Location>0 && w2Location > 0){
                double current = Math.abs(w1Location-w2Location);
                if(current<shortest){
                    shortest=current;
                }
            }
            index += word.length()+1;
        }
        if(w1Location==0 || w2Location==0)
            return -1;

        return shortest;
    }

    public static String runLength(String inp){
        LinkedHashMap<Character,Integer> out = new LinkedHashMap();
        for(char c: inp.toCharArray()){
            if (out.containsKey(c)){
                System.out.println("Inside Cntains:"+c);
                out.put(c,out.get(c)+1);
            }
            else{
                System.out.println("Else:"+c);
                out.put(c,1);
            }

        }
        String output="";
        for(Map.Entry<Character,Integer> entry: out.entrySet()){
            //output+= entry.getKey().toString()+entry.getValue().toString();
            int longest =0;

            for(int i = 0; i< entry.getValue(); i++){
                    output += entry.getKey();

            }
        }


        return output;
    }

    public static int factorial(int n){
        if(n==0) return 1;
        return n* (factorial(n-1));
    }

    public static void pascalTriangle(int n){

        for(int i =0; i <=n;i++){
            for(int j = 0; j <=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(" "+factorial(i)/ (factorial(i-k)*factorial(k)));
            }
            System.out.println();
        }
    }
}