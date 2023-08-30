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
public class FD_Account extends Account {
    private int terms_of_FD;
    private double principal_amt;
    private float int_rate;

    public void addBankAccount(int cust_id) {
        super.addBankAccount(cust_id);
        super.setAcct_type("FD");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the principle amount :");
        this.principal_amt = sc1.nextDouble();
        System.out.println("Enter the interest rate :");
        this.int_rate = sc1.nextFloat();
        System.out.println("Enter the terms of FD :");
        this.terms_of_FD = sc1.nextInt();
    }



    public int getTerms_of_FD() {
        return terms_of_FD;
    }

    public void setTerms_of_FD(int terms_of_FD) {
        this.terms_of_FD = terms_of_FD;
    }

    public double getPrincipal_amt() {
        return principal_amt;
    }

    public void setPrincipal_amt(double principal_amt) {
        this.principal_amt = principal_amt;
    }

    public float getInt_rate() {
        return int_rate;
    }

    public void setInt_rate(float int_rate) {
        this.int_rate = int_rate;
    }

    public FD_Account(int terms_of_FD, double principal_amt, float int_rate, int acct_id, double balance, String acct_type, int acct_no) {
        super(acct_id, balance, acct_type, acct_no);
        this.terms_of_FD = terms_of_FD;
        this.principal_amt = principal_amt;
        this.int_rate = int_rate;
    }
    
    public FD_Account(){
        
    }

   
    
    


    @Override
    public String toString() {
        return "FD_Account -->  Account No. :  "+ this.getAcct_no() + "| Acct ID : " + this.getAcct_id() + "| Principal_Amount : " + principal_amt  + "| Interest_Rate : " + int_rate + "| Term_of_FD :" + terms_of_FD +"\n";
    }

   
}
