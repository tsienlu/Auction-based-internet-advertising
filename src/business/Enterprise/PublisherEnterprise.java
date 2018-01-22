/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.BiddingPlatform.MarketingStrategy;
import Business.BiddingPlatform.MarketingStrategyDirectory;
import Business.FinanceAccount.FinanceAccount;
import Business.Purchase.MasterAdvertiserOrderCatalog;

import Business.Role.Role;
import Ecosystem.Customer;

import Ecosystem.PublisherContent;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class PublisherEnterprise extends Enterprise {

    private MasterAdvertiserOrderCatalog masterAdvertiserOrderCatalog;

    private FinanceAccount financeAccount;
    private PublisherContent publisherContent;
    private ArrayList<Customer> customerList;
    private MarketingStrategyDirectory marketingStrategyList;

    public PublisherEnterprise(String name) {

        super(name, Enterprise.EnterpriseType.Publisher);
        masterAdvertiserOrderCatalog=new MasterAdvertiserOrderCatalog();
        financeAccount = new FinanceAccount();
        publisherContent = new PublisherContent();
        customerList = new ArrayList<Customer>();
        marketingStrategyList=new MarketingStrategyDirectory();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public PublisherContent getPublisherContent() {
        return publisherContent;
    }

    public void setPublisherContent(PublisherContent publisherContent) {
        this.publisherContent = publisherContent;
    }

    

    public MasterAdvertiserOrderCatalog getMasterAdvertiserOrderCatalog() {
        return masterAdvertiserOrderCatalog;
    }

    public FinanceAccount getFinanceAccount() {
        return financeAccount;
    }

    public MarketingStrategyDirectory getMarketingStrategyList() {
        return marketingStrategyList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
