package com.personal.validation.demo;

public class CustomerPOJO {
    //POJO : Plain Old Java Object
    //Bean

    //volatile
    //cached copy of currentBalance in t1 may not be same as t2.
    //t1 -->
    //t2 -->
    //t3

    //
    //Atomic
    volatile int currentBalance;
    String fName;
    //transient
    String  lName;
    String address;
    String dob;
    String country;
    int taxId;

    @Override
    public boolean equals(Object o){
        String name = this.fName + " " + this.lName;
        CustomerPOJO customer = (CustomerPOJO) o;
        return customer.getfName()+" "+customer.getlName() == name;
    }


    public int hashCode(){
        return 123;
    }

    public String toString(){
        return "Customer";
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }
}
