package com.ice.controller.demo;

public class MyExtendThread extends Thread {

        // initiated run method for Thread
        public void run()
        {
            System.out.println("Thread Started Running...");
        }
        public static void main(String[] args) {
            MyExtendThread t1 = new MyExtendThread();

            // Invoking Thread using start() method
            t1.start();
        }
}
