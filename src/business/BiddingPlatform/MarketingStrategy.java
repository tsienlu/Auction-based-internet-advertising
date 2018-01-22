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
public class MarketingStrategy { //SSP

    private float costPerImpression;    //set cost per impression (minBidPrice)
    private ArrayList<String> categoryList; // for each category create atleast one strategy
    private String publisherName;
    private int userAge;
    private String userLocation;
    private String timeOfDay;
    
    public MarketingStrategy() {
        categoryList=new ArrayList<String>();
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public ArrayList<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<String> categoryList) {
        this.categoryList = categoryList;
    }

    public float getCostPerImpression() {
        return costPerImpression;
    }

    public void setCostPerImpression(float costPerImpression) {
        this.costPerImpression = costPerImpression;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
    public void addCategory(String name) {
        categoryList.add(name);
        
    }
    @Override
    public String toString() {
        return userLocation;
    }

}
