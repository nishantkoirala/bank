/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.shoppingcart.mybankmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author nishant.koirala
 */
public class Account {
    private int acct_id;
    private double balance;
    private String acct_type;
    private int acct_no;
    
   public void addBankAccount(int cust_id) {
       Scanner sc1 = new Scanner(System.in);
       System.out.println("Enter the account number :");
       this.acct_no = sc1.nextInt();
       this.acct_id = cust_id;
   }


    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAcct_type() {
        return acct_type;
    }

    public void setAcct_type(String acct_type) {
        this.acct_type = acct_type;
    }

    public int getAcct_no() {
        return acct_no;
    }

    public void setAcct_no(int acct_no) {
        this.acct_no = acct_no;
    }

    public Account(int acct_id, double balance, String acct_type, int acct_no) {
        this.acct_id = acct_id;
        this.balance = balance;
        this.acct_type = acct_type;
        this.acct_no = acct_no;
    }

    public Account() {
        
    }
    

    @Override
    public String toString() {
        return "Account{" + "acct_id=" + acct_id + ", balance=" + balance + ", acct_type=" + acct_type + ", acct_no=" + acct_no + '}';
    }
    
}
