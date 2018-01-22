/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ecosystem;

import Business.BiddingPlatform.AdvertisingStrategy;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.PublisherEnterprise;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class AdExchangeDirectory {
    private ArrayList<AdExchange> adExchangeList;
    
    public AdExchangeDirectory() {
        adExchangeList=new ArrayList<AdExchange>();
    }

    public ArrayList<AdExchange> getAdExchangeList() {
        return adExchangeList;
    }
    
    
    
    public AdExchange addAdExchange(String name) {
        AdExchange adExchange=new AdExchange(name);
        adExchangeList.add(adExchange);
        return adExchange;
    }
    
    public AdvertisingStrategy callBidding(String location, int age, 
             String gender, ArrayList<String> categoryList,String publisherName){
        for(AdExchange ae : adExchangeList){
            for(PublisherEnterprise pe : ae.getPublisherEnterpriseList()){
                if(pe.getName().equals(publisherName)){
                  AdvertisingStrategy as =  ae.bidInitialize(location, age, gender, categoryList,publisherName);
                   return as;
                }
            }
        } return null;
    }
   
}
