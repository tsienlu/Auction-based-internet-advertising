/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.CustomerUsageHistory;

import Ecosystem.AdvertiserProduct;
import Ecosystem.PublisherContent;

/**
 *
 * @author varsha
 */
public class CustomerUsage {
    //attributes: int click, count, 
    private PublisherContent publisherContent;
    private int click;
    private static int count;
    private AdvertiserProduct advertiserProduct;

    public PublisherContent getPublisherContent() {
        return publisherContent;
    }

    public void setPublisherContent(PublisherContent publisherContent) {
        this.publisherContent = publisherContent;
    }

    
    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CustomerUsage.count = count;
    }

    public AdvertiserProduct getAdvertiserProduct() {
        return advertiserProduct;
    }

    public void setAdvertiserProduct(AdvertiserProduct advertiserProduct) {
        this.advertiserProduct = advertiserProduct;
    }
    
    
    
}
