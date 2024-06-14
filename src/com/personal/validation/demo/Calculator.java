package com.personal.validation.demo;


public class Calculator {

    public static void main(String[] args) {
        Calculator calcObject  = new Calculator();
        int output = 0;

        try {
         output = calcObject.divide(500, 0, null);
            //business logic
        }catch(NullPointerException e){
            System.err.println("Exception:"+e.getMessage());
        }
        System.out.println("output:" + output);

    }

    @Override
    public String toString(){
        return "Calculator Demo: is to calculate 2 numerics";
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //hashcode
    //final variables
    //final class
    //final methods
    //mutable
    //immutable classes: String
        // String is final class
        // variables should be declared final
        // do not expose setter method
        // only way to access variable is through get()




    public final int add(int a, int b){
        return addition(a,b);
    }

    private static int addition(int a,int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply (int a, int b){
        return a*b;
    }

    public int divide(int a, int b,String a1) {
        int out = 0;

        try{
            out = a/b;
        }
        catch(ArithmeticException arithmeticException){
            //log4j
            //log.info
            //log.debug
            //log.trace
            //log.error
            System.err.println("Caught by Exception, Please pass the valid input:"+out);
            System.err.println(arithmeticException.getMessage());

        }
        catch(NullPointerException npe){
            System.err.println("Should be handled for best practice:" +
                    "Caught by Null Pointer Exception, Please pass the valid String");
        }
        finally{
            System.out.println("I will be executed always irrespective to catch exceptions");
        }
        return out;
    }
}
