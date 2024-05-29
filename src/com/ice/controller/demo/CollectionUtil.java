package com.ice.controller.demo;

import java.util.*;


public  class CollectionUtil {

     void mi1(){
        System.out.println("Nothing");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(100);
        arrayList.add(25);
        arrayList.add(12);

        arrayList.add(2,5000);
        arrayList.add(2,5000);

        System.out.println(arrayList);
        arrayList.remove(2);

        System.out.println("After Removing 2:"+arrayList);

        LinkedList l1 = new LinkedList();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(2,250);
        arrayList.get(2);
        l1.get(2);

        TreeSet t1 = new TreeSet();
        t1.add(200);
        t1.add(2);
        t1.add(5000);

        System.out.println("Treeset:"+t1.size());

        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
        hm1.put(1, "s1");
        hm1.put(2, "s2");
        hm1.put(1,"abc");
        hm1.put(3,"abc");
        hm1.put(4,"abc");
        hm1.put(null,"abc");
        hm1.put(null,"abccc");
        System.out.println("HashMap:" + hm1);
        hm1.get(2);


        //Retrieval
        //Option 3: Using Iterator
        Iterator i2 =  arrayList.iterator();

        ListIterator<Integer> i1 = arrayList.listIterator();

        while(i1.hasNext()){
            System.out.println("Iterator:"+i1.next());
        }

        //Option 2: Enhanced for loop
        for (Integer integer : arrayList) {
            System.out.println("Enhanced For Loop:" + integer);
        }
        //Option 1:
        for(int i =0; i <= arrayList.size(); i++){
            System.out.println("List of Values from Arraylist:"+arrayList.get(i));
        }

        arrayList.forEach(System.out::println);
        //using streams
        arrayList.stream().forEach(System.out::println);

        //Retrieve data from map
        for(Map.Entry<Integer, String> entry : hm1.entrySet()) {
            String s1 =  entry.getValue();
            Integer key = entry.getKey();
            System.out.println("Key:"+key+":Value:"+s1);
        }


    }
}
 