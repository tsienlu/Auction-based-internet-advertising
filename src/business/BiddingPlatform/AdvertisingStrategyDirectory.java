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
public class AdvertisingStrategyDirectory {
    private ArrayList<AdvertisingStrategy> advertisingStrategyList;
    
    public AdvertisingStrategyDirectory() {
        advertisingStrategyList=new ArrayList<AdvertisingStrategy>();
    }

    public ArrayList<AdvertisingStrategy> getAdvertisingStrategyList() {
        return advertisingStrategyList;
    }
    
    
    
    public AdvertisingStrategy addAdvertisingStrategy() {
        AdvertisingStrategy advertisingStrategy=new AdvertisingStrategy();
        advertisingStrategyList.add(advertisingStrategy);
        return advertisingStrategy;
    }
}
