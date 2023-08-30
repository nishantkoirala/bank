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
public class Employee {
    private int id;
        private String name;
        private String email;
        private int phone;
        private String type; 
    
    public void addBankEmployee (){
    
     Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter Emplyee Name:");
        this.name = sc1.nextLine();
        System.out.println("Enter Employee ID:");
        this.id = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Enter Employee Email:");
        this.email = sc1.nextLine();
        System.out.println("Enter Emplyee Phone:");
        this.phone = sc1.nextInt();
        System.out.println("Enter Emplyee Type(F/P):");
        this.type = sc1.nextLine();
}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
       
        
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Employee(int id, String name, String email, int phone, String type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", type=" + type + '}';
    }
    
}
