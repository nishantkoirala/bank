/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.shoppingcart.mybankmanagementsystem.Account;
import com.itexps.shoppingcart.mybankmanagementsystem.Bank;
import com.itexps.shoppingcart.mybankmanagementsystem.BusinessCustomer;
import com.itexps.shoppingcart.mybankmanagementsystem.Chk_Account;
import com.itexps.shoppingcart.mybankmanagementsystem.Employee;
import com.itexps.shoppingcart.mybankmanagementsystem.Customer;
import com.itexps.shoppingcart.mybankmanagementsystem.FD_Account;
import com.itexps.shoppingcart.mybankmanagementsystem.FullTimeEmployee;
import com.itexps.shoppingcart.mybankmanagementsystem.IndividualCustomer;
import com.itexps.shoppingcart.mybankmanagementsystem.PartTimeEmployee;
import com.itexps.shoppingcart.mybankmanagementsystem.Sav_Account;
import java.util.ArrayList;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nishant.koirala
 */
public class BankTest {

    Bank bank;
    
    Employee employee;
    FullTimeEmployee fulltimeemployee;
    PartTimeEmployee parttimeemployee;
    
    Customer customer;
    BusinessCustomer businesscustomer;
    IndividualCustomer individualcustomer;
    
    Account account;
    Chk_Account chk_account;
    Sav_Account sav_account;
    FD_Account fd_account;
    
    

    public BankTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        bank = new Bank();

        employee = new Employee();
        fulltimeemployee = new FullTimeEmployee();
        parttimeemployee = new PartTimeEmployee();

        customer = new Customer();
        businesscustomer = new BusinessCustomer();
        individualcustomer = new IndividualCustomer();
        
        account = new Account();
        chk_account = new Chk_Account();
        sav_account = new Sav_Account();
        fd_account = new FD_Account();
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testBank() {
        bank = new Bank("Chase", "Chicago", "123456789", "Chase@abc.com", null, null, null, null,null,null,null);
        assertEquals(bank.getBankname(), "Chase");
        assertEquals(bank.getAddress(), "Chicago");
        assertEquals(bank.getPhone(), "123456789");
        assertEquals(bank.getBankemail(), "Chase@abc.com");
    }

    @Test
    public void testEmployee() {

        employee = new Employee(5, "Mark", "mark@abc.com", 111111, "Employee");
        assertEquals(employee.getId(), 5);
        assertEquals(employee.getName(), "Mark");
        assertEquals(employee.getEmail(), "mark@abc.com");
        assertEquals(employee.getPhone(), 111111);
        assertEquals(employee.getType(), "Employee");

        fulltimeemployee = new FullTimeEmployee("1234", 123, 3, "Kevin", "kevin@abc.com", 12345, "FullTime");
        assertEquals(fulltimeemployee.getHealth_insurance_no(), "1234");
        assertEquals(fulltimeemployee.getSalary(), 123.0);
        assertEquals(fulltimeemployee.getId(), 3);
        assertEquals(fulltimeemployee.getName(), "Kevin");
        assertEquals(fulltimeemployee.getEmail(), "kevin@abc.com");
        assertEquals(fulltimeemployee.getPhone(), 12345);
        assertEquals(fulltimeemployee.getType(), "FullTime");

        parttimeemployee = new PartTimeEmployee(1, 20, 4, "Jack", "jack@abc.com", 1234, "PartTime");
        assertEquals(parttimeemployee.getHr(), 1);
        assertEquals(parttimeemployee.getRate(), 20.0f);
        assertEquals(parttimeemployee.getId(), 4);
        assertEquals(parttimeemployee.getName(), "Jack");
        assertEquals(parttimeemployee.getEmail(), "jack@abc.com");
        assertEquals(parttimeemployee.getPhone(), 1234);
        assertEquals(parttimeemployee.getType(), "PartTime");

//        This below test is perform through ArrayList
        ArrayList<FullTimeEmployee> fteList = new ArrayList<FullTimeEmployee>();
        ArrayList<PartTimeEmployee> pteList = new ArrayList<PartTimeEmployee>();
        
        FullTimeEmployee fte = new FullTimeEmployee("123", 123123, 1, "Tom", "tom@abc.com", 123456, "FT");
        PartTimeEmployee pte = new PartTimeEmployee(1, 20, 2, "Mike", "mike@abc.com", 654321, "PT");
        
        fteList.add(fte);
        pteList.add(pte);
        bank = new Bank("Chase", "Chicago", "123456789", "Chase@abc.com", fteList, pteList, null, null,null,null,null);

        assertNotNull(bank.getFteList());
        assertEquals(bank.getFteList().size(), 1);
        assertEquals(bank.getFteList().get(0).getHealth_insurance_no(), "123");
        assertEquals(bank.getFteList().get(0).getSalary(), 123123.0);
        assertEquals(bank.getFteList().get(0).getId(), 1);
        assertEquals(bank.getFteList().get(0).getName(), "Tom");
        assertEquals(bank.getFteList().get(0).getEmail(), "tom@abc.com");
        assertEquals(bank.getFteList().get(0).getPhone(), 123456);
        assertEquals(bank.getFteList().get(0).getType(), "FT");

        assertNotNull(bank.getPteList());
        assertEquals(bank.getPteList().size(), 1);
        assertEquals(bank.getPteList().get(0).getHr(), 1);
        assertEquals(bank.getPteList().get(0).getRate(), 20.0f);
        assertEquals(bank.getPteList().get(0).getId(), 2);
        assertEquals(bank.getPteList().get(0).getName(), "Mike");
        assertEquals(bank.getPteList().get(0).getEmail(), "mike@abc.com");
        assertEquals(bank.getPteList().get(0).getPhone(), 654321);
        assertEquals(bank.getPteList().get(0).getType(), "PT");

    }
//        

    @Test
    public void testCustomer() {
        
        customer = new Customer(5,"Mark", 333333,"mark@abc.com","Illinois");
        assertEquals(customer.getCust_id(),5);
        assertEquals(customer.getFullname(),"Mark");
        assertEquals(customer.getPhone(),333333);
        assertEquals(customer.getEmail(),"mark@abc.com");
        assertEquals(customer.getAddress(),"Illinois");
        
        businesscustomer = new BusinessCustomer("Car", "Sale", 002, 3, "Mike", 222222, "mike@abc.com", "Illinois");
        assertEquals(businesscustomer.getBuss_Name(), "Car");
        assertEquals(businesscustomer.getBuss_Type(), "Sale");
        assertEquals(businesscustomer.getEin(), 002);
        assertEquals(businesscustomer.getCust_id(), 3);
        assertEquals(businesscustomer.getFullname(), "Mike");
        assertEquals(businesscustomer.getPhone(), 222222);
        assertEquals(businesscustomer.getEmail(), "mike@abc.com");
        assertEquals(businesscustomer.getAddress(), "Illinois");

        individualcustomer = new IndividualCustomer(111, "Yes", 4, "Tom", 111111, "tom@abc.com", "Illinois");
        assertEquals(individualcustomer.getSsn(), 111);
        assertEquals(individualcustomer.getSalarised(), "Yes");
        assertEquals(individualcustomer.getCust_id(), 4);
        assertEquals(individualcustomer.getFullname(), "Tom");
        assertEquals(individualcustomer.getPhone(), 111111);
        assertEquals(individualcustomer.getEmail(), "tom@abc.com");
        assertEquals(individualcustomer.getAddress(), "Illinois");

        
//        This below test is perform through ArrayList
        ArrayList<BusinessCustomer> buscustomerList = new ArrayList<BusinessCustomer>();
        ArrayList<IndividualCustomer> indcustomerList = new ArrayList<IndividualCustomer>();

        BusinessCustomer bus = new BusinessCustomer("IT", "Service", 001, 1, "Kevin", 123456, "kevin@abc.com", "Chicago");
        IndividualCustomer ind = new IndividualCustomer(123, "Yes", 2, "Jack", 123456, "jack@abc.com", "Chicago");

        buscustomerList.add(bus);
        indcustomerList.add(ind);
        bank = new Bank("Chase", "Chicago", "123456789", "Chase@abc.com",null,null, buscustomerList, indcustomerList,null,null,null);

        assertNotNull(bank.getBuscustomerList());
        assertEquals(bank.getBuscustomerList().size(), 1);
        assertEquals(bank.getBuscustomerList().get(0).getBuss_Name(), "IT");
        assertEquals(bank.getBuscustomerList().get(0).getBuss_Type(), "Service");
        assertEquals(bank.getBuscustomerList().get(0).getEin(), 001);
        assertEquals(bank.getBuscustomerList().get(0).getCust_id(), 1);
        assertEquals(bank.getBuscustomerList().get(0).getFullname(), "Kevin");
        assertEquals(bank.getBuscustomerList().get(0).getPhone(), 123456);
        assertEquals(bank.getBuscustomerList().get(0).getEmail(), "kevin@abc.com");
        assertEquals(bank.getBuscustomerList().get(0).getAddress(), "Chicago");

        assertNotNull(bank.getIndcustomerList());
        assertEquals(bank.getIndcustomerList().size(), 1);
        assertEquals(bank.getIndcustomerList().get(0).getSsn(), 123);
        assertEquals(bank.getIndcustomerList().get(0).getSalarised(), "Yes");
        assertEquals(bank.getIndcustomerList().get(0).getCust_id(), 2);
        assertEquals(bank.getIndcustomerList().get(0).getFullname(), "Jack");
        assertEquals(bank.getIndcustomerList().get(0).getPhone(), 123456);
        assertEquals(bank.getIndcustomerList().get(0).getEmail(), "jack@abc.com");
        assertEquals(bank.getIndcustomerList().get(0).getAddress(), "Chicago");

    }

    @Test
    public void testAccount() {
        account = new Account(7,123456,"All",777777);
        assertEquals(account.getAcct_id(),7);
        assertEquals(account.getBalance(),123456.0);
        assertEquals(account.getAcct_type(),"All");
        assertEquals(account.getAcct_no(),777777);
        
        chk_account = new Chk_Account(123456, 12345, 13, 4, 1234567,"Checking", 444444);
        assertEquals(chk_account.getPrincipal_amt(),123456.0);
        assertEquals(chk_account.getOvd_limit(),12345.0);
        assertEquals(chk_account.getInt_rate(),13.0f);
        assertEquals(chk_account.getAcct_id(),4);
        assertEquals(chk_account.getBalance(),1234567.0);
        assertEquals(chk_account.getAcct_type(),"Checking");
        assertEquals(chk_account.getAcct_no(),444444);
        
        sav_account = new Sav_Account(123456, 13, 5, 1234567, "Saving", 555555);
        assertEquals(sav_account.getPrincipal_amt(),123456.0);
        assertEquals(sav_account.getInt_rate(),13.0f);
        assertEquals(sav_account.getAcct_id(),5);
        assertEquals(sav_account.getBalance(),1234567.0);
        assertEquals(sav_account.getAcct_type(),"Saving");
        assertEquals(sav_account.getAcct_no(),555555);
        
        fd_account = new FD_Account(10, 123456, 13, 6, 1234567, "Fixed", 666666);
        assertEquals(fd_account.getTerms_of_FD(),10);
        assertEquals(fd_account.getPrincipal_amt(),123456.0);
        assertEquals(fd_account.getInt_rate(),13.0f);
        assertEquals(fd_account.getAcct_id(),6);
        assertEquals(fd_account.getBalance(),1234567.0);
        assertEquals(fd_account.getAcct_type(),"Fixed");
        assertEquals(fd_account.getAcct_no(),666666);
        
//        This below test is perform through ArrayList
        ArrayList<Chk_Account> chk_acct_List = new ArrayList<Chk_Account>();
        ArrayList<Sav_Account> sav_acct_List = new ArrayList<Sav_Account>();
        ArrayList<FD_Account> fd_acct_List = new ArrayList<FD_Account>();

        Chk_Account checking = new Chk_Account(123456, 12345, 13, 1, 1234567, "Checking", 111111);
        Sav_Account saving = new Sav_Account(123456, 13, 2, 1234567, "Saving", 222222);
        FD_Account fixed = new FD_Account(10, 123456, 13, 3, 1234567, "Fixed", 333333);

        chk_acct_List.add(checking);
        sav_acct_List.add(saving);
        fd_acct_List.add(fixed);
        bank = new Bank("Chase", "Chicago", "123456789", "Chase@abc.com",null,null, null,null,chk_acct_List,sav_acct_List,fd_acct_List);

        assertNotNull(bank.getChk_acct_List());
        assertEquals(bank.getChk_acct_List().size(),1);
        assertEquals(bank.getChk_acct_List().get(0).getPrincipal_amt(),123456.0);
        assertEquals(bank.getChk_acct_List().get(0).getOvd_limit(),12345.0);
        assertEquals(bank.getChk_acct_List().get(0).getInt_rate(),13.0f);
        assertEquals(bank.getChk_acct_List().get(0).getAcct_id(),1);
        assertEquals(bank.getChk_acct_List().get(0).getBalance(),1234567.0);
        assertEquals(bank.getChk_acct_List().get(0).getAcct_type(),"Checking");
        assertEquals(bank.getChk_acct_List().get(0).getAcct_no(),111111);
        
        assertNotNull(bank.getSav_acct_List());
        assertEquals(bank.getSav_acct_List().get(0).getPrincipal_amt(),123456.0);
        assertEquals(bank.getSav_acct_List().get(0).getInt_rate(),13.0f);
        assertEquals(bank.getSav_acct_List().get(0).getAcct_id(),2);
        assertEquals(bank.getSav_acct_List().get(0).getBalance(),1234567.0);
        assertEquals(bank.getSav_acct_List().get(0).getAcct_type(),"Saving");
        assertEquals(bank.getSav_acct_List().get(0).getAcct_no(),222222);
        
        assertNotNull(bank.getFd_acct_List());
        assertEquals(bank.getFd_acct_List().get(0).getTerms_of_FD(),10);
        assertEquals(bank.getFd_acct_List().get(0).getPrincipal_amt(),123456.0);
        assertEquals(bank.getFd_acct_List().get(0).getInt_rate(),13f);
        assertEquals(bank.getFd_acct_List().get(0).getAcct_id(),3);
        assertEquals(bank.getFd_acct_List().get(0).getBalance(),1234567d);
        assertEquals(bank.getFd_acct_List().get(0).getAcct_type(),"Fixed");
        assertEquals(bank.getFd_acct_List().get(0).getAcct_no(),333333);
        
        

    }

}
