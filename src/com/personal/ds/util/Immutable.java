package com.personal.ds.util;

class Address implements Cloneable{
    public String streetName;
    public String city;
    public String state;
    public String country;
    public int zipcode;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class Immutable {
    private final String  fName;
    private final String lName;

    private final int age;

    private final Address address;


    public Immutable(String fName, String lName, int age, Address address) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address)address.clone();
    }
}
