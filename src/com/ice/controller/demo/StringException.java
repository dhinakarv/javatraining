package com.ice.controller.demo;


    public class StringException extends Exception {
        public StringException(String errorMessage) {
            super(errorMessage);
            System.err.println("String Exception Caught");
        }
    }

