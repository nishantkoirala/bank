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
public class Bank {

    private String bankname;
    private String address;
    private String phone;
    private String bankemail;

    public ArrayList<FullTimeEmployee> fteList = new ArrayList<FullTimeEmployee>();
    public ArrayList<PartTimeEmployee> pteList = new ArrayList<PartTimeEmployee>();
    public ArrayList<BusinessCustomer> buscustomerList = new ArrayList<BusinessCustomer>();
    public ArrayList<IndividualCustomer> indcustomerList = new ArrayList<IndividualCustomer>();
    public ArrayList<Chk_Account> chk_acct_List = new ArrayList<Chk_Account>();
    public ArrayList<Sav_Account> sav_acct_List = new ArrayList<Sav_Account>();
    public ArrayList<FD_Account> fd_acct_List = new ArrayList<FD_Account>();

    public Bank() {

    }

    public void addBankDetails() {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Add a new Bank");

        System.out.println("Enter Bank Name : ");
        this.bankname = sc1.next();
        System.out.println("Enter Bank Address : ");
        this.address = sc1.next();
        System.out.println("Enter Bank Phone : ");
        this.phone = sc1.next();
        System.out.println("Enter Bank Email : ");
        this.bankemail = sc1.next();
    }

    public void editBankDetails() {

        int ch = 0;
        Scanner sc2 = new Scanner(System.in);

        while (ch >= 0 && ch < 5) {

            System.out.println("*  Choose from the below menu  *");
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println("1. Change Bank name ");
            System.out.println("2. Change Bank Address");
            System.out.println("3. Change Bank Phone");
            System.out.println("4. Change Bank Email");
            System.out.println("5. Exit Menu");

            Scanner sc3 = new Scanner(System.in);
            ch = sc2.nextInt();

            switch (ch) {

                case 1:

                    System.out.println("Enter New Bank Name");
                    this.bankname = sc3.nextLine();
                    break;
                case 2:

                    System.out.println("Enter New Bank Address");
                    this.address = sc3.nextLine();
                    break;
                case 3:
                    System.out.println("Enter New Bank Phone");
                    this.phone = sc3.nextLine();
                    break;
                case 4:
                    System.out.println("Enter New Bank Email");
                    this.bankemail = sc3.nextLine();
                    break;
                case 5:
                    break;

            }
        }
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBankemail() {
        return bankemail;
    }

    public void setBankemail(String bankemail) {
        this.bankemail = bankemail;
    }

    public ArrayList<FullTimeEmployee> getFteList() {
        return fteList;
    }

    public void setFteList(ArrayList<FullTimeEmployee> fteList) {
        this.fteList = fteList;
    }

    public ArrayList<PartTimeEmployee> getPteList() {
        return pteList;
    }

    public void setPteList(ArrayList<PartTimeEmployee> pteList) {
        this.pteList = pteList;
    }

    public ArrayList<BusinessCustomer> getBuscustomerList() {
        return buscustomerList;
    }

    public void setBuscustomerList(ArrayList<BusinessCustomer> buscustomerList) {
        this.buscustomerList = buscustomerList;
    }

    public ArrayList<IndividualCustomer> getIndcustomerList() {
        return indcustomerList;
    }

    public void setIndcustomerList(ArrayList<IndividualCustomer> indcustomerList) {
        this.indcustomerList = indcustomerList;
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

    public ArrayList<FD_Account> getFd_acct_List() {
        return fd_acct_List;
    }

    public void setFd_acct_List(ArrayList<FD_Account> fd_acct_List) {
        this.fd_acct_List = fd_acct_List;
    }

    public Bank(String bankname, String address, String phone, String bankemail,
            ArrayList<FullTimeEmployee> fteList,
            ArrayList<PartTimeEmployee> pteList,
            ArrayList<BusinessCustomer> buscustomerList,
            ArrayList<IndividualCustomer> indcustomerList,
            ArrayList<Chk_Account> chk_acct_List,
            ArrayList<Sav_Account> sav_acct_List,
            ArrayList<FD_Account> fd_acct_List) {
        this.bankname = bankname;
        this.address = address;
        this.phone = phone;
        this.bankemail = bankemail;
        this.fteList = fteList;
        this.pteList = pteList;
        this.buscustomerList = buscustomerList;
        this.indcustomerList = indcustomerList;
        this.chk_acct_List = chk_acct_List;
        this.sav_acct_List = sav_acct_List;
        this.fd_acct_List = fd_acct_List;

    }

    @Override
    public String toString() {
        return "Bank{" + "bankname=" + bankname + ", address=" + address + ", phone=" + phone + ", bankemail=" + bankemail + ", fteList=" + fteList + ", pteList=" + pteList + ", buscustomerList=" + buscustomerList + ", indcustomerList=" + indcustomerList + ", chk_acct_List=" + chk_acct_List + ", sav_acct_List=" + sav_acct_List + ", fd_acct_List=" + fd_acct_List + '}';
    }

}
