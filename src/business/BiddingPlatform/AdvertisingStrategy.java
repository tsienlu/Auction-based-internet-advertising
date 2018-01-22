/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BiddingPlatform;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author varsha
 */
public class AdvertisingStrategy { //DSP

    private float costPerClick; //min bid
    private float maxBidPrice;
    private String userLocation;
    private int userAge;
    private String userGender;
    private ArrayList<String> categoryList; //adding type of ad categories user might be interested in based on age and location:
    //like, sports, kids, movies, etc
    private String timeOfDay;
    private Date date;
    private String advertiserName;

    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public AdvertisingStrategy() {
        categoryList = new ArrayList<String>();
        //date = Calendar.getInstance().getTime();
      
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public float getCostPerClick() {
        return costPerClick;
    }

    public void setCostPerClick(float costPerClick) {
        this.costPerClick = costPerClick;
    }

    public float getMaxBidPrice() {
        return maxBidPrice;
    }

    public void setMaxBidPrice(float maxBidPrice) {
        this.maxBidPrice = maxBidPrice;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public ArrayList<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<String> categoryList) {
        this.categoryList = categoryList;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
    

    public String getAdvertiserName() {
        return advertiserName;
    }

    public void setAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
    }
    
    public String addCategory() {
        String category=new String();
        categoryList.add(category);
        return category;
        
    }
    
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
    
    public String toString() {
        return advertiserName;
    }

}
