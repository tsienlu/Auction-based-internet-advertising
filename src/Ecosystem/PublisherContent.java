/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem;

import Business.Purchase.*;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class PublisherContent {

    private int count = 1;
    private String prodName;
    private int prodId;
    private ArrayList<String> categoryList;
    private int no_of_views;
    private String contentDescription;

    public PublisherContent() {
        prodId = count;
        count++;
        no_of_views = 0;
        categoryList=new ArrayList<String>();
    }

    public ArrayList<String> getCategoryList() {
        return categoryList;

    }

    public void setCategory(ArrayList<String> category) {
        this.categoryList = categoryList;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void addCategory(String cat) {
        categoryList.add(cat);
    }

    public int getNo_of_views() {
        return no_of_views;
    }

    public void setNo_of_views(int no_of_views) {
        this.no_of_views = no_of_views;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }
    
    

    @Override
    public String toString() {
        return prodName;
    }
}
