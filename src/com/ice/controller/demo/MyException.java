package com.ice.controller.demo;

import java.io.FileNotFoundException;

public class MyException {
    public static void main(String[] args) throws StringException {
        System.out.println("Result of Division:"+ExceptionTest.divide(100,0));
        System.out.println("Is String abc:"+ExceptionTest.stringManipulation(null));

    }
}

class ExceptionTest{

    public static int divide(int a, int b){
        int output=0;
        try {
             output = a / b;
        }
        catch(Exception ex){

        }
        return output;
    }

    public static String stringManipulation(String a) throws StringException {
        String output ="";
        try{
        if(a.equals("abc")) {
            output = "true";
            throw new StringException("Error");
        }
        }catch(Exception e){
            e.printStackTrace() ;
        }
            return output;
    }
}
