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
public class Chk_Account extends Account {
    private double principal_amt;
    private double ovd_limit;
    private float int_rate;

public void addBankAccount(int cust_id) {
    super.addBankAccount(cust_id);
    super.setAcct_type("CA");
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the principle amount :");
    this.principal_amt = sc1.nextDouble();
    System.out.println("Enter the over draft limit :");
    this.ovd_limit = sc1.nextDouble();
    System.out.println("Enter the interest rate :");
    this.int_rate = sc1.nextFloat();
}


    public double getPrincipal_amt() {
        return principal_amt;
    }

    public void setPrincipal_amt(double principal_amt) {
        this.principal_amt = principal_amt;
    }

    public double getOvd_limit() {
        return ovd_limit;
    }

    public void setOvd_limit(double ovd_limit) {
        this.ovd_limit = ovd_limit;
    }

    public float getInt_rate() {
        return int_rate;
    }

    public void setInt_rate(float int_rate) {
        this.int_rate = int_rate;
    }

    public Chk_Account(double principal_amt, double ovd_limit, float int_rate, int acct_id, double balance, String acct_type, int acct_no) {
        super(acct_id, balance, acct_type, acct_no);
        this.principal_amt = principal_amt;
        this.ovd_limit = ovd_limit;
        this.int_rate = int_rate;
    }

    public Chk_Account (){
        
    }
    
    


    @Override
    public String toString() {
        return "CheckingAccount -->  Account No. :  "+ this.getAcct_no() + "| Acct ID : " + this.getAcct_id() + "| Principal_Amount : " + principal_amt + "| Ovd_Limit : " + ovd_limit + "| Interest_Rate : " + int_rate +"\n";
    }
    

   
    
}
