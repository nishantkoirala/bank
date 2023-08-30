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
public class IndividualCustomer extends Customer {
    private int ssn;
        private String salarised;
        
         @Override
        public void addBankCustomer(){
            super.addBankCustomer();
            super.setType("I");
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter Y/N if the customer earns a salary :");
            this.salarised = sc3.nextLine();
            System.out.println("Enter SSN :");
            this.ssn = sc3.nextInt();
        }
   

        

       public IndividualCustomer editBankCustomer (IndividualCustomer indcustomer) {
           Scanner sc1 = new Scanner(System.in);
           String new_name,new_address,new_salarised;
           int new_phone;
           System.out.println("Enter new detils");
           System.out.println("------------------");
           System.out.println("Enter new name :");
           new_name = sc1.nextLine();
           indcustomer.setFullname(new_name);
           System.out.println("Enter new phone number :");
           new_phone = sc1.nextInt();
           indcustomer.setPhone(new_phone);
           System.out.println("Enter new address :");
           new_address = sc1.nextLine();
           indcustomer.setAddress(new_address);
           System.out.println("Enter Y/N if the customer is salaried :");
           new_salarised =sc1.nextLine();
           indcustomer.setSalarised(new_salarised);
           
           String answer;
           if (indcustomer.getChk_acct().getAcct_id() == 0) {
               System.out.println("Does this customer want a CHECKING ACCOUNT ? (y/Y) or (n/N)");
               answer = sc1.nextLine();
               if (answer.equalsIgnoreCase("y")) {
                   this.chk_acct.addBankAccount(indcustomer.getCust_id());
               }
            }     
           String answer1;
           if (indcustomer.getSav_acct().getAcct_id() == 0) {
               System.out.println("Does this customer want a SAVING ACCOUNT ? (y/Y) or (n/N)");
               answer1 = sc1.nextLine();
               if(answer1.equalsIgnoreCase("y")) {
                   this.sav_acct.addBankAccount(indcustomer.getCust_id());
               }
           }
      
        
       String answer2;
       if (indcustomer.getFd_acct().getAcct_id() == 0) {
           System.out.println("Does this customer want a FD ACCOUNT ? (y/Y) or (n/N)");
           answer2 = sc1.nextLine();
           if (answer2.equalsIgnoreCase("y")) {
               this.fd_acct.addBankAccount(indcustomer.getCust_id());
           }
       }
return indcustomer ;
       }
       
        

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getSalarised() {
        return salarised;
    }

    public void setSalarised(String salarised) {
        this.salarised = salarised;
    }

    public IndividualCustomer() {
        
       
    }

    public IndividualCustomer(int ssn, String salarised,int cust_id, String fullname, int phone, String email, String address) {
        super(cust_id, fullname, phone, email, address);
         this.ssn = ssn;
        this.salarised = salarised;
    }
   

    @Override
    public String toString() {
        return "Individual Customer ->  Name : " + this.getFullname() + "| Customer ID : "+ this.getCust_id()+"| Phone : " + this.getPhone() + "| Address : " + this.getAddress() + "| Salarised=" + salarised +"\n";
    }

   
    

}
