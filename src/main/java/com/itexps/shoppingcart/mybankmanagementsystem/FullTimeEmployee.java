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
public class FullTimeEmployee extends Employee {
    private String health_insurance_no;
    private double salary;
    
   
    @Override
    public void addBankEmployee(){
         
       super.addBankEmployee();
       super.setType("F");
       Scanner sc1 = new Scanner(System.in);
       
        System.out.println("Enter Health Insurance Number : ");
        this.health_insurance_no = sc1.nextLine();
        System.out.println("Enter Salary :");
        this.salary = sc1.nextDouble();
    }
    
       public FullTimeEmployee editBankEmployee(FullTimeEmployee newfte){
           
           Scanner sc5 = new Scanner(System.in);
           String new_name,new_health_insurance_no,new_Salary_no;
           
           System.out.println("Enter New Details");
           System.out.println("----------");
           System.out.println("Enter New Name :");
           new_name = sc5.nextLine();
           newfte.setName(new_name);
           System.out.println("Enter New Health Insurance No :");
           new_health_insurance_no = sc5.nextLine();
           newfte.setHealth_insurance_no(new_health_insurance_no);
           System.out.println("Enter Salary");
           new_Salary_no = sc5.nextLine();
           newfte.setSalary(salary);
           
           return newfte; 
       }

    public String getHealth_insurance_no() {
        return health_insurance_no;
    }

    public void setHealth_insurance_no(String health_insurance_no) {
        this.health_insurance_no = health_insurance_no;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(String health_insurance_no, double salary, int id, String name, String email, int phone, String type) {
        super (id, name, email, phone, type );
        this.health_insurance_no = health_insurance_no;
        this.salary = salary;
    }

    public FullTimeEmployee() {
    }
    
    

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "health_insurance_no=" + health_insurance_no + ", salary=" + salary + '}';
    }
    
}
