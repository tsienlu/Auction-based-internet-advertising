/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem;

import Business.BiddingPlatform.AdvertisingStrategy;
import Business.BiddingPlatform.AdvertisingStrategyDirectory;
import Business.BiddingPlatform.MarketingStrategy;
import Business.BiddingPlatform.MarketingStrategyDirectory;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.FinanceAccount.FinanceAccount;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class AdExchange extends Organization {

    private AdvertisingStrategyDirectory advertisingStrategyDirectory;
    private MarketingStrategyDirectory marketingStrategyDirectory;
    private ArrayList<AdvertiserEnterprise> advertiserEnterpriseList;
    private ArrayList<PublisherEnterprise> publisherEnterpriseList;
    private FinanceAccount financeAccount;
    private OrganizationDirectory orgDir;

    public AdExchange(String name) {
        super(name);
        financeAccount = new FinanceAccount();
        advertiserEnterpriseList = new ArrayList<AdvertiserEnterprise>();
        publisherEnterpriseList = new ArrayList<PublisherEnterprise>();
        orgDir = new OrganizationDirectory();

    }

    public OrganizationDirectory getOrgDir() {
        return orgDir;
    }

    public void setOrgDir(OrganizationDirectory orgDir) {
        this.orgDir = orgDir;
    }

    public AdvertisingStrategyDirectory getAdvertisingStrategyDirectory() {
        return advertisingStrategyDirectory;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    

    public MarketingStrategyDirectory getMarketingStrategyDirectory() {
        return marketingStrategyDirectory;
    }

    public ArrayList<AdvertiserEnterprise> getAdvertiserEnterpriseList() {
        return advertiserEnterpriseList;
    }

    public ArrayList<PublisherEnterprise> getPublisherEnterpriseList() {
        return publisherEnterpriseList;
    }

    public FinanceAccount getFinanceAccount() {
        return financeAccount;
    }

    public void addAdvertiserEnterprise(AdvertiserEnterprise a) {

        advertiserEnterpriseList.add(a);

    }

    public void addPublisherEnterprise(PublisherEnterprise p) {
        publisherEnterpriseList.add(p);
    }

    public ArrayList<AdvertisingStrategy> findWinnerByUserLocation(String userLocation) {
        ArrayList<AdvertisingStrategy> ast1 = new ArrayList<AdvertisingStrategy>();
        for (AdvertiserEnterprise aden : advertiserEnterpriseList) {
            for (AdvertisingStrategy as : aden.getAdvertisingStrategyDirectory().getAdvertisingStrategyList()) {
                if (as.getUserLocation().equalsIgnoreCase(userLocation)) {
                    ast1.add(as);

                }
            }
        }
        return ast1;
    }

    public ArrayList<AdvertisingStrategy> findWinnerByTimeOfDayAndAge(ArrayList<AdvertisingStrategy> ast1, int age) {
        ArrayList<AdvertisingStrategy> ast2 = new ArrayList<AdvertisingStrategy>();

        for (AdvertisingStrategy as : ast1) {
            if (as.getUserAge() < age) {
                ast2.add(as);
            }
        }

        return ast2;
    }

    public ArrayList<AdvertisingStrategy> findWinnerByUserAgeGenderAndCategory(ArrayList<AdvertisingStrategy> ast2, int userAge, String gender, ArrayList<String> categoryList) {
        ArrayList<AdvertisingStrategy> ast3 = new ArrayList<AdvertisingStrategy>();
        for (AdvertisingStrategy as : ast2) {

            if (as.getCategoryList().containsAll(categoryList) && as.getUserAge() < userAge || as.getUserGender().equals(gender)) {
                ast3.add(as);
            }

        }
        return ast3;
    }

    public AdvertisingStrategy findWinnerByBidPrice(ArrayList<AdvertisingStrategy> ast3, float minBidPrice) {
        ArrayList<AdvertisingStrategy> ast4 = new ArrayList<AdvertisingStrategy>();
        float winner_bid = 0;
        AdvertisingStrategy advertisingStrategy = new AdvertisingStrategy();
        for (AdvertisingStrategy as : ast3) {
            if (as.getMaxBidPrice() > minBidPrice) {
                ast4.add(as);
            }
        }
        for (AdvertisingStrategy as : ast4) {
            if (as.getMaxBidPrice() > winner_bid) {
                winner_bid = as.getMaxBidPrice();
                advertisingStrategy = as;
            }
        }
        return advertisingStrategy;
    }

    public AdvertisingStrategy bidInitialize(String location, int age,
            String gender, ArrayList<String> categoryList, String publisherName) {
        ArrayList<MarketingStrategy> ma = new ArrayList<MarketingStrategy>();
        ArrayList<MarketingStrategy> ma1 = new ArrayList<MarketingStrategy>();
        float min_bid = 0;

        for (PublisherEnterprise p : publisherEnterpriseList) {
            if (p.getName().equals(publisherName)) {
                for (MarketingStrategy ms : p.getMarketingStrategyList().getMarketingStrategyList()) {
                    for(String category:ms.getCategoryList())
                    if (categoryList.contains(category)) {
                        ma.add(ms);
                    }
                }
            }
        }
        
        for (MarketingStrategy ms : ma1) {
            if (min_bid < ms.getCostPerImpression()) {
                min_bid = ms.getCostPerImpression();
            }
        }
        ArrayList<AdvertisingStrategy> first = findWinnerByUserLocation(location);
        ArrayList<AdvertisingStrategy> second = findWinnerByTimeOfDayAndAge(first, age);
        ArrayList<AdvertisingStrategy> third = findWinnerByUserAgeGenderAndCategory(second, age, gender, categoryList);
        AdvertisingStrategy a = findWinnerByBidPrice(third, min_bid);
        return a;
    }

    @Override
    public String toString() {
        return super.getName();
    }

}
