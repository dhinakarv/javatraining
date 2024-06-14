package com.personal.validation.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class BufferedReaderTest {

    // Main Method
    public static void main(String[] args)
            throws IOException
    {
        // Creating BufferedReader Object
       // InputStreamReader converts bytes to stream of character
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        // String reading internally
        String str = bfn.readLine();
        // Integer reading internally
        int it1 = Integer.parseInt(bfn.readLine());

        int it2 = Integer.parseInt(bfn.readLine());
        // Printing String
        System.out.println("Entered String : " + str);
        // Printing Integer
        System.out.println("Entered Integer 1: " + it1);
        System.out.println("Entered Integer 2: " + it2);
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        System.out.println("Entered String through scanner : " + s1);


        //Primitives : int / float / char / byte / short / long / double
        int i = 10;
        long l = 0;
        float f= 0.0F;
        double d = 0.0;

        //Autoboxing
        Integer in1 = i;
        System.out.println("After Autoboxing:"+in1);

        //Unboxing
        Integer in2 = new Integer(100);
        i = in2;
        System.out.println("After Unboxing:"+i);
    }


}

