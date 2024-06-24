package com.personal.gs;

import com.personal.validation.demo.MyHashMap;

import java.util.LinkedList;

public class CustomHashMap<K,V> {
    private class Entry<K,V>{
        private K key;
        private V value;
        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    public int capacity = 16;
    public LinkedList<Entry<K,V>>[] list ;

    CustomHashMap(){
        list= new LinkedList[capacity];
        for(int i=0; i < capacity; i++){
            list[i] = new LinkedList<>();
        }
    }
    public int hashing(K key){
        return Math.abs(key.hashCode()%capacity);
    }

    public void put(K key, V value){
        int index =  hashing(key);
        LinkedList<Entry<K,V>> bucket= list[index];
        for(Entry<K,V> e: bucket){
            if(e.key.equals(key)){
                e.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    public V get(K key){
        int index = hashing(key);
        LinkedList<Entry<K,V>> bucket = list[index];
        for(Entry<K,V> e: bucket){
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CustomHashMap m1 = new CustomHashMap();
        m1.put("a","Dhinakar");
        m1.put("b","Gayu");
        System.out.println(m1.get("a"));
    }
}
