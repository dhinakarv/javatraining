package com.ice.controller.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AccountImplListSort {
    public static void main(String[] args) {
        AccountPOJO bofa = new AccountPOJO();
        bofa.setAccountName("BOFA");
        bofa.setAcctNumber(10);
        bofa.setJurisdiction("USA");

        AccountPOJO bofa1 = new AccountPOJO();
        bofa1.setAccountName("BOFA");
        bofa1.setAcctNumber(10);
        bofa1.setJurisdiction("USA");

        AccountPOJO ice = new AccountPOJO();
        ice.setAccountName("ice");
        ice.setAcctNumber(100);
        ice.setJurisdiction("USA");

        AccountPOJO nyse = new AccountPOJO();
        nyse.setAccountName("nyse");
        nyse.setAcctNumber(20);
        nyse.setJurisdiction("USA");

        System.out.println("Account:"+bofa);
        System.out.println("Account:"+bofa1);
        System.out.println("Account:"+ice);
        System.out.println("Account:"+nyse);

        System.out.println("BOFA and BOFA1 are same??:"+bofa1.equals(bofa));
        System.out.println("ICE and BOFA1 are same??:"+bofa1.equals(ice));
        System.out.println("ICE and NYSE are same??:"+nyse.equals(ice));

        System.out.println("Hashcode of BOFA:"+bofa.hashCode());
        System.out.println("Hashcode of BOFA1:"+bofa1.hashCode());
        System.out.println("Hashcode of ice:"+ice.hashCode());
        System.out.println("Hashcode of nyse:"+nyse.hashCode());

        AccountPOJO anyAccount = new AccountPOJO();

        AccountPOJO anyAccount1 = new USAccount();

        USAccount anyAccount2 = new USAccount();

       // USAccount anyAccount3 = new Account();


        //Generics
        ArrayList<AccountPOJO> l1 = new ArrayList<>();
        l1.add(ice);
        l1.add(bofa);
        l1.add(nyse);
        l1.add(bofa1);
        System.out.println("Before Sorting:"+l1);
        Collections.sort(l1);
        System.out.println("After Sorting:"+l1);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(123);
        l2.add(23);
        Collections.sort(l2);

        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);

        System.out.println("L3:"+l3);

        List<Integer> l4 = Arrays.asList(1,2,3,4,5);

        System.out.println("Arrays Class's list:"+l4);



    }

}
