package com.personal.ds.util;
 class Singleton {
    private static Singleton OBJECT = null;
    private Singleton(){
    }

    public static synchronized Singleton getInstance(){
        if(OBJECT ==null)
        OBJECT= new Singleton();
        return OBJECT;
    }
}

public class SingletonImpl{

 public static void main(String[] args) {
     Singleton s1 = Singleton.getInstance();
     Singleton s2 = Singleton.getInstance();;
     Singleton s3 =Singleton.getInstance();;

     System.out.println("HashCode:" + s1.hashCode() + ":" + s2.hashCode() + ":" + s3.hashCode());

     if (s1.equals(s2)) {
         System.out.println("S1 & S2 are same");
     }
     if (s1.equals(s3)) {
         System.out.println("S1 & S3 are same");
     }

 }
}