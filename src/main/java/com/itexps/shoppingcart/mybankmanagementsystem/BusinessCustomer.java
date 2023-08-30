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
public class BusinessCustomer extends Customer {
    private String Buss_Name;
        private String Buss_Type;
        private int ein;
        
         @Override
        public void addBankCustomer(){
            super.addBankCustomer();
            super.setType("B");
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter Type of Business :");
            this.Buss_Type = sc2.nextLine();
        }
        
        public BusinessCustomer editBankCustomer (BusinessCustomer buscustomer) {
            Scanner sc1 = new Scanner(System.in);
            String new_name, new_address, new_businesstype;
            int new_phone;
            System.out.println("Enter new details");
            System.out.println("--------------------");
            System.out.println("Enter new name : ");
            new_name = sc1.nextLine();
            buscustomer.setFullname(new_name);
            System.out.println("Enter new phone number :");
            new_phone = sc1.nextInt();
            buscustomer.setPhone(new_phone);
            System.out.println("Enter new address :");
            new_address = sc1.nextLine();
            buscustomer.setAddress(new_address);
            System.out.println("Enter new type of business :");
            new_businesstype = sc1.nextLine();
            buscustomer.setBuss_Type(new_businesstype);
            String answer;
            if(buscustomer.getChk_acct().getAcct_id() == 0) {
                System.out.println("Does this customer want a CHECKING ACCOUNT ? (y/Y) or (n/N");
                answer = sc1.nextLine();
                if (answer.equalsIgnoreCase("y")){
                    this.chk_acct.addBankAccount(buscustomer.getCust_id());
                }
            }
          String answer1;
          if (buscustomer.getSav_acct().getAcct_id() == 0) {
              System.out.println("Does this customer want a SAVING ACCOUNT ? (y/Y) or (n/N)");
              answer1 = sc1.nextLine();
              if (answer1.equalsIgnoreCase("y")) {
                  this.sav_acct.addBankAccount(buscustomer.getCust_id());
              }
            
        }
        String answer2;
        if (buscustomer.getFd_acct().getAcct_id() == 0) {
            System.out.println("Does this customer want a FD ACCOUNT ? (y/Y) or (n/N)");
            answer2 = sc1.nextLine();
            if(answer2.equalsIgnoreCase("y")) {
                this.fd_acct.addBankAccount(buscustomer.getCust_id());
            }
        }
        
 return buscustomer ;
        }

      

      

    

    public String getBuss_Name() {
        return Buss_Name;
    }

    public void setBuss_Name(String Buss_Name) {
        this.Buss_Name = Buss_Name;
    }

    public String getBuss_Type() {
        return Buss_Type;
    }

    public void setBuss_Type(String Buss_Type) {
        this.Buss_Type = Buss_Type;
    }

    public int getEin() {
        return ein;
    }

    public void setEin(int ein) {
        this.ein = ein;
    }

    public BusinessCustomer() {
        
    }

    public BusinessCustomer(String Buss_Name, String Buss_Type, int ein, int cust_id, String fullname, int phone, String email, String address) {
        super(cust_id, fullname, phone, email, address);
        this.Buss_Name = Buss_Name;
        this.Buss_Type = Buss_Type;
        this.ein = ein;
    }
    
   



  @Override
    public String toString() {
        return "Business Customer ->  Name : " + this.getFullname() + "| Customer ID : " + this.getCust_id() + "| Phone : " + this.getPhone() + "| Address : " + this.getAddress() + "| Type_of_business=" + Buss_Type + "\n";
    }

    

   
    

    

    

   

    

   
}
