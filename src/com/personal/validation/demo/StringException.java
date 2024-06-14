package com.personal.validation.demo;


    public class StringException extends Exception {
        public StringException(String errorMessage) {
            super(errorMessage);
            System.err.println("String Exception Caught");
        }
    }

