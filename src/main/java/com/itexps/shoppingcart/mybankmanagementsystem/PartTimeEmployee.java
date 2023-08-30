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
public class PartTimeEmployee extends Employee {
    private int hr;
    private float rate;
    
    @Override
    public void addBankEmployee(){
         
       super.addBankEmployee();
       super.setType("P");
       Scanner sc1 = new Scanner(System.in);
       
        System.out.println("Enter Hours : ");
        this.hr = sc1.nextInt();
        System.out.println("Enter Rate :");
        this.rate = sc1.nextFloat();
        
    }
    
       public PartTimeEmployee editBankEmployee(PartTimeEmployee newpte){
           
           Scanner sc5 = new Scanner(System.in);
           String new_name,new_hours,new_rate;
           
           System.out.println("Enter New Details");
           System.out.println("----------");
           System.out.println("Enter New Name :");
           new_name = sc5.nextLine();
           newpte.setName(new_name);
           System.out.println("Enter New Hours :");
           new_hours = sc5.nextLine();
           newpte.setHr(hr);
       
           System.out.println("Enter Rate");
           new_rate = sc5.nextLine();
           newpte.setRate(rate);
           
           return newpte; 
       }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public PartTimeEmployee(int hr, float rate, int id, String name, String email, int phone, String type) {
        super(id, name, email, phone, type);
        this.hr = hr;
        this.rate = rate;
    }

    public PartTimeEmployee() {
        
    }

   

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "hr=" + hr + ", rate=" + rate + '}';
    }
    
}
