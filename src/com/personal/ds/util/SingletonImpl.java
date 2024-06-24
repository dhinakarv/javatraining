package com.personal.ds.util;

class Singleton{
    private static Singleton s1 = null;
    private Singleton(){}

    public static Singleton getInstance(){
        synchronized(Singleton.class){
            if(s1==null){
                s1 = new Singleton();
            }
        }

        return s1;
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