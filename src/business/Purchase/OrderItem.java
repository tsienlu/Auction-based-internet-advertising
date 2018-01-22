/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Purchase;

import Business.Enterprise.AdvertiserEnterprise;
import Ecosystem.AdvertiserProduct;

/**
 *
 * @author prat
 */
public class OrderItem {
    private AdvertiserProduct product;
    private AdvertiserEnterprise adEnt;
    private int quantity;

    
    public int getQuantity() {
        return quantity;
    }

    public AdvertiserProduct getProduct() {
        return product;
    }

    public void setProduct(AdvertiserProduct product) {
        this.product = product;
    }

    public AdvertiserEnterprise getAdEnt() {
        return adEnt;
    }

    public void setAdEnt(AdvertiserEnterprise adEnt) {
        this.adEnt = adEnt;
    }
    
   

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
   
    @Override
     public String toString(){
        
        return product.getProdName();
    }
}
