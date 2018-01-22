/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.BiddingPlatform.AdvertisingStrategy;
import Business.BiddingPlatform.AdvertisingStrategyDirectory;
import Business.FinanceAccount.FinanceAccount;
import Business.Purchase.MasterAdvertiserOrderCatalog;
import Business.Purchase.MasterCustomerOrderCatalog;
import Business.Role.Role;
import Ecosystem.AdvertiserProduct;
import Ecosystem.PublisherContent;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class AdvertiserEnterprise extends Enterprise {

    private MasterAdvertiserOrderCatalog masterAdvertiserOrderCatalog;
    private MasterCustomerOrderCatalog masterCustomerOrderCatalog;
    private FinanceAccount financeAccount;
    private AdvertisingStrategyDirectory advertisingStrategyDirectory;
    private ArrayList<AdvertiserProduct> adProList;
    

    public AdvertiserEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Advertiser);
        masterAdvertiserOrderCatalog=new MasterAdvertiserOrderCatalog();
        masterCustomerOrderCatalog=new MasterCustomerOrderCatalog();
        advertisingStrategyDirectory=new AdvertisingStrategyDirectory();
        financeAccount = new FinanceAccount();
        financeAccount.setBalance(10000);
        adProList = new ArrayList<AdvertiserProduct>();
    }

    public ArrayList<AdvertiserProduct> getAdProList() {
        return adProList;
    }

   

    public MasterAdvertiserOrderCatalog getMasterAdvertiserOrderCatalog() {
        return masterAdvertiserOrderCatalog;
    }

    public FinanceAccount getFinanceAccount() {
        return financeAccount;
    }

    public AdvertisingStrategyDirectory getAdvertisingStrategyDirectory() {
        return advertisingStrategyDirectory;
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public MasterCustomerOrderCatalog getMasterCustomerOrderCatalog() {
        return masterCustomerOrderCatalog;
    }

    public void setMasterCustomerOrderCatalog(MasterCustomerOrderCatalog masterCustomerOrderCatalog) {
        this.masterCustomerOrderCatalog = masterCustomerOrderCatalog;
    }
    
    
}
