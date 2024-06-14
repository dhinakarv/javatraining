package com.personal.validation.demo;

public class StringOperations {
     int i ;

    //String Pool
    public static void main(String[] args) {
        String s1 = "Mahesh";
       String s2 = "Mahesh";
        System.out.println("Strings are same?:"+s1.equals(s2));//true
        System.out.println("Strings are same Memory?:"+s1==s2);//false
        //ways to initialize/declare arrays
        int[] a={1,2,3,4}, b={4,6,5,7};
        int a1[]={1,2,3},b1=123;
        int a2[] = new int[10];
        int i;
        StringOperations sp = new StringOperations();
        System.out.println(sp.i);
        System.out.println("Array at index position 0:"+a[3]);

        for(int j =0; j<a.length;j++){
            a[j]=j+100;
        }

        for(int j =0; j<a.length;j++){
            System.out.println("Value of a[j]"+a[j]);
        }
        char[] c1 = new char[s1.length()];
        System.out.println("String of s1:"+s1);

        for(int j =0; j<s1.length();j++){
            System.out.println("Value is:"+s1.charAt(j)+":"+j);
        }

        //SWITCH
        if(1==1){

        }else if(1==1){

        }else{

        }

        switch(s1) {
            default:
                System.out.println("Default");
            case "a":
                System.out.println("a");
            case "Mahesh":
                System.out.println("Mahesh");
            case "b":
                System.out.println("b");
            case "c":
                System.out.println("c");
        }

//OOPS -- Pure Object Oriented

        //class
        //object
        //Abstraction
        //Encapsulation
        //Polymorphism
        //Inheritance





    }
}
