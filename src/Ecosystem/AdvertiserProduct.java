/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem;

/**
 *
 * @author varsha
 */
public class AdvertiserProduct extends PublisherContent {

    private int price;
    private int avail;
    private int total_sold;
    private String FILENAME;
    
    

    public AdvertiserProduct() {

        //count++;
        total_sold = 0;
    }

    
    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public int getTotal_sold() {
        return total_sold;
    }

    public void setTotal_sold(int total_sold) {
        this.total_sold = total_sold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFILENAME() {
        return FILENAME;
    }

    public void setFILENAME(String FILENAME) {
        this.FILENAME = FILENAME;
    }
    
    

}
