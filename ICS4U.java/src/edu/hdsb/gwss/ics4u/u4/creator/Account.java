/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4.creator;

/**
 *
 * @author Calvin
 */
public class Account {
    
    //CLASS CONSTANTS
    //CLASS VARIABLES
    
    //OBJECT VARIABLES
    private String currency;
    private int branch;
    private int accountNumber;
    private int balance;
    private int pin;

    public String fName, lName, address;

    public Account() {
    }

    //Primary Key
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.pin = 123;
    }
    
    //Secondary Key
    public Account(String fName, String lName, String address) {
        this.balance = 100;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {

        this.currency = currency;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
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

    @Override
    public String toString() {
        return "Account{" + "currency=" + currency + ", branch=" + branch + ", accountNumber=" + accountNumber + ", balance=" + balance + ", pin=" + pin + ", fName=" + fName + ", lName=" + lName + ", address=" + address + '}';
    }
    
    
}
