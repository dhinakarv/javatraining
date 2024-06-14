package com.personal.validation.demo;
class Student1{
    public static void main(String[] args) {

    }
}
public class Student {
    public Student() {
    }

    public Student(String s1){
        System.out.println(s1);
    }

    public Student(int iabc){
        this.i=iabc;
    }

    public Student(int iabc, int jabc){
        this.i=iabc;
        this.j=jabc;
    }





    int i,j,k;
    boolean flag;
    String s1,s2,s3;



    // final int z;


    public static void main(String[] args) {
         Student s1 = new Student();
         //Student s2= new Student(100,200);
         //System.out.println("Value of i:"+s1.i);
        System.out.println(s1.add(1,5));
        System.out.println(s1.add(1.0f,5.0f));
    }

    public int add(int i,int j){
        add(1.5f,2.5f);
        return i+j;
    }

    private float add(float i,float j){
        return i+j+100.0f;
    }

    void m1(){
        int i , j,k;
        final int z=10;
        //z=10000;
    }
    void m2(){
    }

    void m3(){

    }
}

//Account --> RelationshipAccount (2)/ USAccount (1)/ NonUSAccount(5) / BeneficiaryAccount / APACAccount

