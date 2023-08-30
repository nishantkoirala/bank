/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.shoppingcart.mybankmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nishant.koirala
 */
public class Customer {
    private int cust_id;
    private String fullname;
    private int phone;
    private String email;
    private String address;
    private String type;
   
            
    
    private ArrayList<Chk_Account> chk_acct_List = new ArrayList<Chk_Account>();
    private ArrayList<Sav_Account> sav_acct_List = new ArrayList<Sav_Account>();
    private ArrayList<FD_Account> fd_acct_List = new ArrayList<FD_Account>();
    public ArrayList<BusinessCustomer> buscustomerList = new ArrayList<BusinessCustomer>();
    public ArrayList<IndividualCustomer> indcustomerList = new ArrayList<IndividualCustomer>();

    
    
    Sav_Account sav_acct = new Sav_Account(0,0,0,0,"",0);
    Chk_Account chk_acct = new Chk_Account(0,0,0,0,0,"",0);
    FD_Account fd_acct = new FD_Account(0,0,0,0,0,"",0);
    
    public void addBankCustomer(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Customer name :");
        this.fullname = sc1.nextLine();
        System.out.println("Enter Customer ID :");
        this.cust_id = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Enter Customer phone number :");
        this.phone = sc1.nextInt();
        System.out.println("Enter Customer Address :");
        this.address = sc1.nextLine();
        System.out.println("Enter Customer email : ");
        this.email = sc1.nextLine();
        
        String answer;
        System.out.println("Does this customer want a CHEKING ACCOUNT ? (y/Y) or (n/N)");
        answer = sc1.nextLine();
        if(answer.equalsIgnoreCase("y")){
            chk_acct.addBankAccount(this.cust_id);
        }
        String answer1;
        System.out.println("Does this customer want a SAVING ACCOUNT ? (y/Y) or (n/N)");
        answer1 = sc1.nextLine();
        if (answer1.equalsIgnoreCase("y")){
            sav_acct.addBankAccount(this.cust_id);
        }
        String answer2;
        System.out.println("Does this customer want a FD ACCOUNT ? (y/Y) or (n/N)");
        answer2 = sc1.nextLine();
        if (answer2.equalsIgnoreCase("y")){
            fd_acct.addBankAccount(this.cust_id);
    }
}

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public ArrayList<Chk_Account> getChk_acct_List() {
        return chk_acct_List;
    }

    public void setChk_acct_List(ArrayList<Chk_Account> chk_acct_List) {
        this.chk_acct_List = chk_acct_List;
    }

    public ArrayList<Sav_Account> getSav_acct_List() {
        return sav_acct_List;
    }

    public void setSav_acct_List(ArrayList<Sav_Account> sav_acct_List) {
        this.sav_acct_List = sav_acct_List;
    }

    public ArrayList<FD_Account> getFD_acct_List() {
        return fd_acct_List;
    }

    public void setFD_Acct_List(ArrayList<FD_Account> fd_acct_List) {
        this.fd_acct_List = fd_acct_List;
    }



    public Customer( int cust_id, String fullname, int phone, String email, String address ) {
        this.cust_id = cust_id;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        
       
    }

   public Customer(){
       
   }
    
    public Sav_Account getSav_acct() {
        return sav_acct;
    }

    public void setSav_acct(Sav_Account sav_acct) {
        this.sav_acct = sav_acct;
    }

    public Chk_Account getChk_acct() {
        return chk_acct;
    }

    public void setChk_acct(Chk_Account chk_acct) {
        this.chk_acct = chk_acct;
    }

    public FD_Account getFd_acct() {
        return fd_acct;
    }

    public void setFd_acct(FD_Account fd_acct) {
        this.fd_acct = fd_acct;
    }
    
 

    @Override
    public String toString() {
        return "Customer{" + "cust_id=" + cust_id + ", fullname=" + fullname + ", phone=" + phone + ", email=" + email + ", address=" + address + ", type=" + type + ", chk_acct_List=" + chk_acct_List + ", sav_acct_List=" + sav_acct_List + ", fd_acct_List=" + fd_acct_List + ", sav_acct=" + sav_acct + ", chk_acct=" + chk_acct + ", fd_acct=" + fd_acct + '}';
    }
    
}
