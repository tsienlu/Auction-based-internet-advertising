/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Purchase;

import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class MasterAdvertiserOrderCatalog {
    private ArrayList<AdvertiserOrder> masterOrderList;
    
    public MasterAdvertiserOrderCatalog(){
        
        masterOrderList = new ArrayList<AdvertiserOrder>();
    }

    public ArrayList<AdvertiserOrder> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<AdvertiserOrder> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public AdvertiserOrder addOrder(AdvertiserOrder order){
        
        masterOrderList.add(order);
        
        return order;
    }
    
}
