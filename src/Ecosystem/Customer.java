/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem;

import Business.CustomerUsageHistory.CustomerUsageHistory;
import Business.Employee.Employee;
import Business.FinanceAccount.FinanceAccount;
import Business.Purchase.MasterCustomerOrderCatalog;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class Customer extends Employee {

    private FinanceAccount financeAccount;
    private String location;
    public ArrayList<String> interestList;
    private int age;
    private CustomerUsageHistory customerUsageHistory;
    private String gender;
    private MasterCustomerOrderCatalog moc;

    public Customer() {
        interestList = new ArrayList<String>();
        financeAccount = new FinanceAccount();
        customerUsageHistory = new CustomerUsageHistory();
        moc=new MasterCustomerOrderCatalog();
    }

    public MasterCustomerOrderCatalog getMoc() {
        return moc;
    }

    public void setMoc(MasterCustomerOrderCatalog moc) {
        this.moc = moc;
    }
    
    

    public FinanceAccount getFinanceAccount() {
        return financeAccount;
    }

    public void setFinanceAccount(FinanceAccount financeAccount) {
        this.financeAccount = financeAccount;
    }

    public CustomerUsageHistory getCustomerUsageHistory() {
        return customerUsageHistory;
    }

    public ArrayList<String> getInterestList() {
        return interestList;
    }

    public void setInterestList(ArrayList<String> interestList) {
        this.interestList = interestList;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setCustomerUsageHistory(CustomerUsageHistory customerUsageHistory) {
        this.customerUsageHistory = customerUsageHistory;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String addInterest() {
        String interest = new String();
        interestList.add(interest);
        return interest;
    }

}
