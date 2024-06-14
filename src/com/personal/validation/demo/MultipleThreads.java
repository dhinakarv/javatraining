package com.personal.validation.demo;

public class MultipleThreads {
    public static void main(String[] args) throws InterruptedException {

        Thread1 t1 = new Thread1();
        Thread2 t2 =  new Thread2();
        t1.start();
        //t1.start(); --> Illegal Thread State Exception
        t2.start();
        //wait --> thread will go to blocked state
        //notify --> thread/s will be back to runnable state
        //sleep --> thread will be in waiting state (in timed wait)

        //sych method to implement mutex
        //create thread and use wait and notify and sleep
        //ExecutorService framework in java
        //Latch object
        //Lock - Reentrant lock
        //Semaphore
        //Fork and Join pool


    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i =0 ; i <=10; i++){
                System.out.println("Thread 1:"+i);
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i =0 ; i <=10; i++){
            System.out.println("Thread 2:"+i);
        }
    }
}
