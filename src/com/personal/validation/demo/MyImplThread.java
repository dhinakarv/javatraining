package com.personal.validation.demo;

public class MyImplThread implements Runnable {
    public void run()
    {
        System.out.println(
                "Thread is Running Successfully");
    }

    public static void main(String[] args)
    {
        MyImplThread myT = new MyImplThread();
        // initializing Thread Object
        Thread t1 = new Thread(myT);
        t1.setName("MyImplThread");
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
    }
}
