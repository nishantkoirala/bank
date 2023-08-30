/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.shoppingcart.mybankmanagementsystem;

import com.itexps.shoppingcart.mybankmanagementsystem.BusinessCustomer;
import com.itexps.shoppingcart.mybankmanagementsystem.IndividualCustomer;
import com.itexps.shoppingcart.mybankmanagementsystem.FullTimeEmployee;
import com.itexps.shoppingcart.mybankmanagementsystem.PartTimeEmployee;
import com.itexps.shoppingcart.mybankmanagementsystem.Chk_Account;
import com.itexps.shoppingcart.mybankmanagementsystem.FD_Account;
import com.itexps.shoppingcart.mybankmanagementsystem.Sav_Account;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nishant.koirala
 */
public class MyBankManagementSystem {
    public static void main(String[] args) {
        
    
    
    int choice = 0;
        Bank MyBankManagementSystem = new Bank();
        
        
        
        
       while (choice != 15){
    
            System.out.println();
            System.out.println("                                * WELCOME TO BANK MANAGEMENT SYSTEM *");
            System.out.println("                                --------------------------------------------");
            System.out.println();
            System.out.println("                                     * Choose from the following Menu * ");
            System.out.println();
            System.out.println("       BANK                         EMPLOYEE                   CUSTOMER                         ACCOUNT");
            System.out.println("      ======                       ==========                  ========                         =======");
            System.out.println("1. ADD BANK DETAILS         4. ADD BANK EMPLOYEE        8. ADD BANK CUSTOMER            12. UPDATE ACCOUNT INFORMATION");
            System.out.println("2. EDIT BANK DETAILS        5. UPDATE BANK EMPLOYEE     9. UPDATE CUSTOMER DETAIL       13. SEARCH BY ACCOUNT ID");
            System.out.println("3. VIEW BANK DETAILS        6. SEARCH BY EMP ID         10. SEARCH BY CUST ID           14. VIEW ALL ACCOUNTS IN BANK");
            System.out.println("                            7. VIEW ALL EMPLOYEES       11. VIEW ALL CUSTOMERS          15. EXIT BANKING SYSTEM");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            

            switch (choice) {

                case 1 :
                    
                    MyBankManagementSystem.addBankDetails();
                    break;
                    
                case 2 :
                    
                    MyBankManagementSystem.editBankDetails();
                    break;
                    
                case 3 : 
                    System.out.println("* THE BANK DETAILS ARE AS FOLLOWS *");
                    System.out.println("Bank Name    :" + MyBankManagementSystem.getBankname());
                    System.out.println("Bank Address :" + MyBankManagementSystem.getAddress());
                    System.out.println("Bank Phone   :" + MyBankManagementSystem.getPhone());
                    System.out.println("Bank Email   :" + MyBankManagementSystem.getBankemail());
                    System.out.println("No. of Full Time Employees : " + MyBankManagementSystem.getFteList().size());
                    System.out.println("No. of Part Time Employees : " + MyBankManagementSystem.getPteList().size());
                    System.out.println("No. of Business Customers : " + MyBankManagementSystem.getBuscustomerList().size());
                    System.out.println("No. of Individual Customers : " + MyBankManagementSystem.getIndcustomerList().size());
                    break;
            
                    
                 case 4 :    
                     FullTimeEmployee fte = new FullTimeEmployee();
                     PartTimeEmployee pte = new PartTimeEmployee();
                     
                     int emptype;
                     Scanner sc4 = new Scanner(System.in);
                     System.out.println("* Enter 1 for FULL TIME EMPLOYEE and 2 for PART TIME EMPLOYEE *");
                     emptype = sc4.nextInt();
                     
                     if (emptype == 1) {
                         fte.addBankEmployee();
                         MyBankManagementSystem.getFteList().add(fte);
                     } else {
                         pte.addBankEmployee();
                         MyBankManagementSystem.getPteList().add(pte);
                         
                     }
                   break;
                    
                 case 5 : 
                     Scanner sc5 = new Scanner(System.in);
                     int search_ID, found = 0;
                     System.out.println("Enter the Employee ID for which you want to update data :");
                     search_ID = sc5.nextInt();
                     sc5.nextLine();
                     for (FullTimeEmployee newfte : MyBankManagementSystem.getFteList()) {
                         if (search_ID == newfte.getId()){
                             newfte = newfte.editBankEmployee(newfte);
                             found = 1;
                         }
                     }
                     if (found == 0) {
                         for (PartTimeEmployee newpte : MyBankManagementSystem.getPteList()) {
                             if (search_ID == newpte.getId()){
                                 newpte = newpte.editBankEmployee(newpte);
                                 found = 1;
                             }
                         }
                     }
                     if (found == 0){
                         System.out.println("No Employee Existed");
                     }
                   break;
                
                    
                 case 6 : 
                     Scanner sc6 = new Scanner(System.in);
                     int search_ID1, found1 = 0;
                     System.out.println("Enter the Employee ID you wanna search :");
                     search_ID1 = sc6.nextInt();
                     sc6.nextLine();
                     for (FullTimeEmployee newfte : MyBankManagementSystem.getFteList()) {
                         if (search_ID1 == newfte.getId()){
                             System.out.println("Full Time Employee Found ! The details are as follow ");
                             System.out.println("Name         :" + newfte.getName());
                             System.out.println("ID           :" + newfte.getId());
                             System.out.println("Health Insurance No. :" + newfte.getHealth_insurance_no());
                             found1 = 1;
                             
                         }
                         
                     }
                     if (found1 == 0){
                         for (PartTimeEmployee newpte : MyBankManagementSystem.getPteList()){
                             if (search_ID1 == newpte.getId()){
                                 System.out.println("Part Time Employee Found ! The details are as follow ");
                                 System.out.println("Name       :" + newpte.getName());
                                 System.out.println("ID         :" + newpte.getId());
                                 found1 = 1;
                             }
                         }
                     }
                     if( found1 == 0){
                         System.out.println("No Employee Existed ! Try Again ");
                     }
                   break;
                     
                     
                    
                    case 7 : 
                        String currentLine;
                        
                        
                        
                        try {
                            
                            FileWriter fw = new FileWriter("c:\\MyBankManagementSystem\\EmployeeList.txt",true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            for (FullTimeEmployee viewfte : MyBankManagementSystem.getFteList()) {
                                bw.write(viewfte.toString());
                            }
                            for (PartTimeEmployee viewpte : MyBankManagementSystem.getPteList()) {
                                bw.write(viewpte.toString());
                            }
                            
                            bw.close();
                            fw.close();
                            
                            
                            FileReader fr = new FileReader("c:\\MyBankManagementSystem\\EmployeeList.txt");
                            BufferedReader br = new BufferedReader(fr);
                            currentLine = br.readLine();
                            while (currentLine != null) {
                                System.out.println(currentLine);
                                currentLine = br.readLine();
                            }
                            
                            bw.close();
                            fw.close();
                            
                        } catch (IOException e) {
                            
                            e.getMessage();
                        }
                      break;

                    
                    case 8 : 
                        BusinessCustomer bcust = new BusinessCustomer();
                        IndividualCustomer icust = new IndividualCustomer();
                        Chk_Account chk_acct = new Chk_Account(0,0,0,0,0,"",0);
                        Sav_Account sav_acct = new Sav_Account(0,0,0,0,"",0);
                        FD_Account fd_acct = new FD_Account(0,0,0,0,0,"",0);
                        Scanner sc8 = new Scanner(System.in);
                        int custtype;
                        System.out.println("Enter 1 for BUSINESS CUSTOMER and 2 for INDIVIDUAL CUSTOMER");
                        custtype = sc8.nextInt();
                if (custtype == 1) {
                    bcust.addBankCustomer();
                    chk_acct = bcust.getChk_acct();
                    sav_acct = bcust.getSav_acct();
                    fd_acct = bcust.getFd_acct();
                    MyBankManagementSystem.getBuscustomerList().add(bcust);
                    if(chk_acct.getAcct_id()!=0){
                        MyBankManagementSystem.getChk_acct_List().add(chk_acct);
                    }
                    if(sav_acct.getAcct_id()!=0){
                        MyBankManagementSystem.getSav_acct_List().add(sav_acct);
                    }
                    if(fd_acct.getAcct_id()!=0){
                        MyBankManagementSystem.getFd_acct_List().add(fd_acct);
                    }
                } else {
                    icust.addBankCustomer();
                    chk_acct = icust.getChk_acct();
                    sav_acct = icust.getSav_acct();
                    fd_acct = icust.getFd_acct();
                    MyBankManagementSystem.getIndcustomerList().add(icust);
                    if(chk_acct.getAcct_id()!=0){
                        MyBankManagementSystem.getChk_acct_List().add(chk_acct);
                    }
                    if(sav_acct.getAcct_id()!=0){
                        MyBankManagementSystem.getSav_acct_List().add(sav_acct);
                    }
                    if(fd_acct.getAcct_id()!=0){
                        MyBankManagementSystem.getFd_acct_List().add(fd_acct);
                    }
                }
                  break;
                    
               
                
                    

                     
                   
                    case 9 : 
                    Scanner sc9 = new Scanner(System.in);
                    int cust_search_ID,
                    datafound = 0,
                    cust_found = 0,
                    caccttrigger,
                    saccttrigger,
                    fdaccttrigger;
                    
                    Chk_Account chk_acct1;
                    Sav_Account sav_acct1;
                    FD_Account fd_acct1;
                        System.out.println("Enter the Customer ID for which you want to update data :");
                        cust_search_ID = sc9.nextInt();
                        sc9.nextLine();
                        for (BusinessCustomer buss_cust : MyBankManagementSystem.getBuscustomerList()){
                            if (cust_search_ID == buss_cust.getCust_id()){
                                caccttrigger = (int) buss_cust.getChk_acct().getPrincipal_amt();
                                caccttrigger = (int) buss_cust.getChk_acct().getOvd_limit();
                                caccttrigger = (int) buss_cust.getChk_acct().getInt_rate();
                                saccttrigger = (int) buss_cust.getSav_acct().getPrincipal_amt();
                                saccttrigger = (int) buss_cust.getSav_acct().getInt_rate();
                                fdaccttrigger = (int) buss_cust.getFd_acct().getPrincipal_amt();
                                fdaccttrigger = buss_cust.getFd_acct().getTerms_of_FD();
                                fdaccttrigger = (int) buss_cust.getFd_acct().getInt_rate();
                                
                                buss_cust = buss_cust.editBankCustomer(buss_cust);
                                cust_found = 1;
                                
                                chk_acct1 = buss_cust.getChk_acct();
                                System.out.println(chk_acct1.toString());
                                sav_acct1 = buss_cust.getSav_acct();
                                System.out.println(sav_acct1.toString());
                                fd_acct1 = buss_cust.getFd_acct();
                                System.out.println(fd_acct1.toString());
                                
                                if (caccttrigger == 0 && chk_acct1.getPrincipal_amt()!=0) {
                                    MyBankManagementSystem.getChk_acct_List().add(chk_acct1);
                                    
                                }
                                if (caccttrigger == 0 && chk_acct1.getOvd_limit()!=0) {
                                    MyBankManagementSystem.getChk_acct_List().add(chk_acct1);
                                }
                                if (caccttrigger == 0 && chk_acct1.getInt_rate()!=0) {
                                    MyBankManagementSystem.getChk_acct_List().add(chk_acct1);
                                }
                                if (saccttrigger == 0 && sav_acct1.getInt_rate()!=0) {
                                    MyBankManagementSystem.getSav_acct_List().add(sav_acct1);
                                }
                                if (saccttrigger == 0 && sav_acct1.getPrincipal_amt()!=0) {
                                    MyBankManagementSystem.getSav_acct_List().add(sav_acct1);
                                }
                                if (fdaccttrigger == 0 && fd_acct1.getPrincipal_amt()!=0) {
                                    MyBankManagementSystem.getFd_acct_List().add(fd_acct1);
                                }
                                if (fdaccttrigger == 0 && fd_acct1.getInt_rate()!=0) {
                                    MyBankManagementSystem.getFd_acct_List().add(fd_acct1);
                                }
                                if (fdaccttrigger == 0 && fd_acct1.getTerms_of_FD()!=0){
                                    MyBankManagementSystem.getFd_acct_List().add(fd_acct1);
                                }
                                
                              }
                             }
                        if (cust_found == 0) {
                            for (IndividualCustomer indi_cust : MyBankManagementSystem.getIndcustomerList()) {
                                if (cust_search_ID == indi_cust.getCust_id()) {
                                    caccttrigger = (int) indi_cust.getChk_acct().getPrincipal_amt();
                                    caccttrigger = (int) indi_cust.getChk_acct().getOvd_limit();
                                    caccttrigger = (int) indi_cust.getChk_acct().getInt_rate();
                                    saccttrigger = (int) indi_cust.getSav_acct().getPrincipal_amt();
                                    saccttrigger =  (int) indi_cust.getSav_acct().getInt_rate();
                                    fdaccttrigger = (int) indi_cust.getFd_acct().getPrincipal_amt();
                                    fdaccttrigger = (int) indi_cust.getFd_acct().getInt_rate();
                                    fdaccttrigger = indi_cust.getFd_acct().getTerms_of_FD();
                                   
                                    indi_cust = indi_cust.editBankCustomer(indi_cust);
                                    cust_found = 1;
                                    
                                    chk_acct1 = indi_cust.getChk_acct();
                                    System.out.println(chk_acct1.toString());
                                    sav_acct1 = indi_cust.getSav_acct();
                                    System.out.println(sav_acct1.toString());
                                    fd_acct1 = indi_cust.getFd_acct();
                                    System.out.println(fd_acct1.toString());
                                    
                                    if (caccttrigger == 0 && chk_acct1.getPrincipal_amt()!=0) {
                                        MyBankManagementSystem.getChk_acct_List().add(chk_acct1);
                                    }
                                    if (caccttrigger == 0 && chk_acct1.getOvd_limit()!=0 ) {
                                    MyBankManagementSystem.getChk_acct_List().add(chk_acct1);
                                }
                                    if (caccttrigger == 0 && chk_acct1.getInt_rate()!=0 ) {
                                    MyBankManagementSystem.getChk_acct_List().add(chk_acct1);
                                }
                                    if (saccttrigger == 0 && sav_acct1.getInt_rate()!=0) {
                                        MyBankManagementSystem.getSav_acct_List().add(sav_acct1);
                                    }
                                    if (saccttrigger == 0 && sav_acct1.getPrincipal_amt()!=0){
                                        MyBankManagementSystem.getSav_acct_List().add(sav_acct1);
                                    }
                                    if (fdaccttrigger == 0 && fd_acct1.getPrincipal_amt()!=0) {
                                        MyBankManagementSystem.getFd_acct_List().add(fd_acct1);
                                    }
                                    if (fdaccttrigger == 0 && fd_acct1.getInt_rate()!=0) {
                                        MyBankManagementSystem.getFd_acct_List().add(fd_acct1);
                                    }
                                    if(fdaccttrigger == 0 && fd_acct1.getTerms_of_FD()!=0){
                                        MyBankManagementSystem.getFd_acct_List().add(fd_acct1);
                                    }
                            }
                        }
                        
                  }
                       if (cust_found == 0){
                           System.out.println("No Customer ID exists ! Try Again");
                       }
                    break;
                    
                    case 10 :
                        Scanner sc10 = new Scanner(System.in);
                        int search_ID2, found2 = 0;
                        System.out.println("Enter the customer ID you want to search");
                        search_ID2 = sc10.nextInt();
                        sc10.nextLine(); 
                        for (BusinessCustomer buss_cust : MyBankManagementSystem.getBuscustomerList()) {
                            if(search_ID2 == buss_cust.getCust_id()){
                                System.out.println("Business Customer found. The details are as follow");
                                System.out.println("Name : " + buss_cust.getFullname());
                                System.out.println("ID  :" + buss_cust.getCust_id());
                                System.out.println("Phone  :" + buss_cust.getPhone());
                                System.out.println("Address  :" + buss_cust.getAddress());
                                System.out.println("Type of Business  :" + buss_cust.getBuss_Type());
                                System.out.println(" These are the associated accounts :");
                                if (buss_cust.getChk_acct().getAcct_no() != 0 ){
                                    System.out.println("Checking Account : " + buss_cust.getChk_acct().getAcct_no());
                                }
                                if (buss_cust.getSav_acct().getAcct_no() != 0) {
                                    System.out.println("Saving Account : " + buss_cust.getSav_acct().getAcct_no());
                                }
                                if (buss_cust.getFd_acct().getAcct_no()!= 0) {
                                    System.out.println("FD Account : " + buss_cust.getFd_acct().getAcct_no());
                                }
                                found2 = 1;
                            }
                        }
                        if (found2 == 0) {
                            for (IndividualCustomer indi_cust : MyBankManagementSystem.getIndcustomerList()) {
                                if (search_ID2 == indi_cust.getCust_id()) {
                                    System.out.println("Individual Customer Found. The details are as follow");
                                    System.out.println("Name :" + indi_cust.getFullname());
                                    System.out.println("ID :" + indi_cust.getCust_id());
                                    System.out.println("Phone :" + indi_cust.getPhone());
                                    System.out.println("Address :" + indi_cust.getAddress());
                                    System.out.println("Salarised :" + indi_cust.getSalarised());
                                    System.out.println("These are associated account :");
                                    if (indi_cust.getChk_acct().getAcct_no()!= 0) {
                                        System.out.println("Checking Account : " + indi_cust.getChk_acct().getAcct_no());
                                    }
                                    if (indi_cust.getSav_acct().getAcct_no()!= 0) {
                                        System.out.println("Saving Account : " + indi_cust.getSav_acct().getAcct_no());
                                    }
                                    if (indi_cust.getFd_acct().getAcct_no()!= 0) {
                                        System.out.println("FD Account : " + indi_cust.getFd_acct().getAcct_no());
                                    }
                                    found2 = 1;
                                }
                            }
                        }    
                        if (found2 == 0) {
                            System.out.println("No such customer ID exists ! Try Again");
                        }
                        
                        break;
               
                        case 11:

                    String currentLine1;

                   

                    try {
                        //System.out.println("inside try block - file writer");
                        FileWriter fw = new FileWriter("c:\\MyBankManagementSystem\\CustomerList.txt",true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        for (BusinessCustomer buss_cust : MyBankManagementSystem.getBuscustomerList()) {
                            bw.write(buss_cust.toString());
                        }
                        for (IndividualCustomer indi_cust : MyBankManagementSystem.getIndcustomerList()) {
                            bw.write(indi_cust.toString());
                        }

                        bw.close();
                        fw.close();

                        
                        FileReader fr = new FileReader("c:\\MyBankManagementSystem\\CustomerList.txt");
                        BufferedReader br = new BufferedReader(fr);
                        currentLine1 = br.readLine();
                        while (currentLine1 != null) {
                            System.out.println(currentLine1);
                            currentLine1 = br.readLine();
                        }

                        bw.close();
                        fw.close();

                    } catch (Exception e) {

                        e.getMessage();

                    }

                    break;
                    
                        case 12 :
                            Scanner sc12 = new Scanner(System.in);
                            int search_ID12;
                            int found12 = 0;
                            double value;
                            float value1;
                            int value2;
                            System.out.println("Enter the account number for which you want to update data :");
                            search_ID12 = sc12.nextInt();
                            for (Chk_Account chk_acct12 : MyBankManagementSystem.getChk_acct_List()) {
                                if(chk_acct12.getAcct_no() == search_ID12){
                                    System.out.println("Enter new principle amount :");
                                    value = sc12.nextDouble();
                                    chk_acct12.setPrincipal_amt(value);
                                    System.out.println("Enter new over draft limit :");
                                    value = sc12.nextDouble();
                                    chk_acct12.setOvd_limit(value);
                                    System.out.println("Enter new interest rate :");
                                    value1 = sc12.nextFloat();
                                    chk_acct12.setInt_rate(value1);
                                    found12 = 1;
                                    
                                }
                            }
                            
                        for (Sav_Account sav_acct12 : MyBankManagementSystem.getSav_acct_List()) {
                            if(sav_acct12.getAcct_no() == search_ID12){
                                System.out.println("Enter new principle amount :");
                                value = sc12.nextDouble();
                                sav_acct12.setPrincipal_amt(value);
                                System.out.println("Enter new interest rate");
                                value1 = sc12.nextFloat();
                                sav_acct12.setInt_rate(value1);
                                found12 = 1;
                            }
                        }

                       for (FD_Account fd_acct12 : MyBankManagementSystem.getFd_acct_List()) {
                           if(fd_acct12.getAcct_no() == search_ID12){
                               System.out.println("Enter new principle amount :");
                               value = sc12.nextDouble();
                               fd_acct12.setPrincipal_amt(value);
                               System.out.println("Enter new interest rate :");
                               value1 = sc12.nextFloat();
                               fd_acct12.setInt_rate(value1);
                               System.out.println("Enter new term of FD :");
                               value2 = sc12.nextInt();
                               fd_acct12.setTerms_of_FD(value2);
                               found12 = 1;
                           }
                       }
                       if(found12 == 0) {
                           System.out.println("No such Account ID exists ! Enter Again");
                       }
                       break;
                       
                        case 13 :
                            Scanner sc13 = new Scanner(System.in);
                            int search_ID13;
                            int found13 = 0;
                            System.out.println("Enter the Account No. you want to search :");
                            search_ID13 = sc13.nextInt();
                            for (Chk_Account chk_acct12 : MyBankManagementSystem.getChk_acct_List()) {
                                if(chk_acct12.getAcct_no() == search_ID13){
                                    System.out.println("Checking Account Details are as follow :");
                                    System.out.println("Assoiciated Customer ID : " +chk_acct12.getAcct_id());
                                    System.out.println("Principle Amount : " + chk_acct12.getPrincipal_amt());
                                    System.out.println("Over Draft Limit : " + chk_acct12.getOvd_limit());
                                    System.out.println("Interest Rate : " + chk_acct12.getInt_rate());
                                    found13 = 1;
                                }
                            }
                            
                       for (Sav_Account sav_acct12 : MyBankManagementSystem.getSav_acct_List()) {
                           if(sav_acct12.getAcct_no() == search_ID13){
                               System.out.println("Saving Account Details are as follow :");
                               System.out.println("Associated Customer ID : " + sav_acct12.getAcct_id());
                               System.out.println("Principle Amount : " + sav_acct12.getPrincipal_amt());
                               System.out.println("Interest Rate : " + sav_acct12.getInt_rate());
                               found13 = 1;
                           }
                       }
                   
                       for (FD_Account fd_acct12 : MyBankManagementSystem.getFd_acct_List()) {
                           if(fd_acct12.getAcct_no() == search_ID13){
                               System.out.println("FIxed Deposit Account Details are as follow :");
                               System.out.println("Associated Customer ID : " + fd_acct12.getAcct_id());
                               System.out.println("Principle Amount : " + fd_acct12.getPrincipal_amt());
                               System.out.println("Interest Rate : " + fd_acct12.getInt_rate());
                               System.out.println("Terms of FD : " + fd_acct12.getTerms_of_FD());
                               found13 = 1;
                           }
                       }
                       if (found13 == 0) {
                           System.out.println("No such Account ID exists ! Enter Again");
                       }
                       break;

                        case 14 :
                            
                            String currentLine14;
                            try{
                                FileWriter fw = new FileWriter("c:\\MyBankManagementSystem\\AccountList.txt",true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                for (Chk_Account chk_acct14 : MyBankManagementSystem.getChk_acct_List()){
                                    bw.write(chk_acct14.toString());
                                }
                                for (Sav_Account sav_acct14 : MyBankManagementSystem.getSav_acct_List()){
                                    bw.write(sav_acct14.toString());
                                }
                                for (FD_Account fd_acct14 : MyBankManagementSystem.getFd_acct_List()){
                                    bw.write(fd_acct14.toString());
                                }
                                bw.close();
                                fw.close();
                                
                                FileReader fr = new FileReader("c:\\MyBankManagementSystem\\AccountList.txt");
                                BufferedReader br = new BufferedReader(fr);
                                currentLine14 = br.readLine();
                                while (currentLine14 != null){
                                    System.out.println(currentLine14);
                                    currentLine14 = br.readLine();
                                }
                                bw.close();
                                fw.close();
                                
                            } catch (Exception e) {
                                e.getMessage();
                            }
                            break;



                    case 15 :
                        
                        System.exit(0);
                    
}
       
       
       
}
}
    
}
