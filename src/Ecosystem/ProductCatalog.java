/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ecosystem;

import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class ProductCatalog {
    
    private ArrayList<PublisherContent> productList;
    
    public ProductCatalog() {
        productList = new ArrayList<PublisherContent>();
    }

    public ArrayList<PublisherContent> getProductList() {
        return productList;
    }

    
    
    public PublisherContent addPublisherProduct() {
        PublisherContent p = new PublisherContent();
        productList.add(p);
        return p;
    }
    
    
    public PublisherContent searchPublisherProduct(int id) {
        //ArrayList<PublisherProduct> result = new ArrayList<PublisherProduct>();
        for(PublisherContent p : productList) {
            if(p.getProdId()== id) {
                return p;
            }
        }
        return null;
    }
}
