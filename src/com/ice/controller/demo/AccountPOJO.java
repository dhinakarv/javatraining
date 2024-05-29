package com.ice.controller.demo;

import java.util.Objects;

public class AccountPOJO implements Comparable<AccountPOJO>
{
    int acctNumber;
    String jurisdiction;

    String accountName;

    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString(){
        return "Account Name:"+getAccountName()+":Account Number:"+getAcctNumber()+":Jurisdiction:"+getJurisdiction();
    }

   /* @Override
    public int compare(Account a1, Account a2) {
        int accountNameCompare = a1.getAccountName().compareTo(a2.getAccountName());
        if (accountNam¡eCompare != 0) {
            return accountNameCompare;
        }
        return Integer.compare(a1.getAcctNumber(),a2.getAcctNumber()) ;
    }*/


    @Override
    public int compareTo(AccountPOJO account) {
        //Account account = (Account) o;
        return Integer.compare(this.getAcctNumber(),account.getAcctNumber()) ;
    }


    @Override
    public int hashCode(){
        return Objects.hash(getAcctNumber(),getAccountName());
    }

    @Override
    public boolean equals(Object object){
        if (object==this) {
            return true;
        }
        if (!(object instanceof AccountPOJO)) {
            return false;
        }
        AccountPOJO account = (AccountPOJO) object;
        return Integer.compare(this.acctNumber, account.getAcctNumber())==0 && this.accountName.equals(account.getAccountName());
    }


}
