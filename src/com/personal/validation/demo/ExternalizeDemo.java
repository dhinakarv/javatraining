package com.personal.validation.demo;

import java.io.*;


public class ExternalizeDemo implements Externalizable {
    String name;
    int age;
    int jobId;

    //No argument constructor
    public ExternalizeDemo() {
        System.out.println("Public no-argument constructor");

    }

    //Default Constructor
    public ExternalizeDemo(String name, int age, int jobId) {
        this.name = name;
        this.age = age;
        this.jobId = jobId;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}