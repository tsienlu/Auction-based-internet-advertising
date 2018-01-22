/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.BiddingPlatform;

import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class MarketingStrategyDirectory {
    private ArrayList<MarketingStrategy> marketingStrategyList;
    
   
    
    public MarketingStrategyDirectory() {
        marketingStrategyList=new ArrayList<MarketingStrategy>();
    }

    public ArrayList<MarketingStrategy> getMarketingStrategyList() {
        return marketingStrategyList;
    }
    
    public MarketingStrategy addMarketingStrategy() {
        MarketingStrategy marketingStrategy=new MarketingStrategy();
        marketingStrategyList.add(marketingStrategy);
        return marketingStrategy;
    }
}
