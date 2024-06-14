package com.personal.validation.demo;

import java.util.LinkedList;

public class MyHashMap<K,V> {

    private class Entry<K,V>{
        K key;
        V value;
        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Entry<K, V>>[] list;
    public int initialCapacity = 16;

    public MyHashMap(){
        list = new LinkedList[initialCapacity];
        for (int i = 0; i < initialCapacity; i++){
            list[i] = new LinkedList<>();

        }
    }

    public int hash(K key){
        return Math.abs(key.hashCode() % initialCapacity);
    }

    public void put(K key, V value){
        int index =  hash(key);
        LinkedList<Entry<K, V>> bucket =  list[index];
        for (Entry<K,V> e: bucket ){
            if(e.key.equals(key)){
                e.value = value;
                return;
            }
        }
        bucket.add(new Entry<> (key,value));
    }

    public V get(K key){
    int index = hash(key);
    LinkedList<Entry<K,V>> bucket = list[index];

    for (Entry<K, V> e: bucket){
        if(e.key.equals(key)){
            return e.value;
        }
    }
    return null;
    }

    public static void main(String[] args) {
        MyHashMap m1 = new MyHashMap();

        m1.put("a","1");
        m1.put("b","2");
        m1.put("c","3");
        System.out.println("HashMap:"+m1.get("b"));
    }

}
