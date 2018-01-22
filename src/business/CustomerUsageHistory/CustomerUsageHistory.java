/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.CustomerUsageHistory;

import Ecosystem.PublisherContent;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class CustomerUsageHistory {
    //Publisher content viewed, click of advertiser product. Excludes purchase of advertiser.
    private ArrayList<CustomerUsage> customerUsageHistory;
    
    public CustomerUsageHistory() {
        customerUsageHistory=new ArrayList<CustomerUsage>();
    }

    public ArrayList<CustomerUsage> getCustomerUsageHistory() {
        return customerUsageHistory;
    }

    public void setCustomerUsageHistory(ArrayList<CustomerUsage> customerUsageHistory) {
        this.customerUsageHistory = customerUsageHistory;
    }
    
    public CustomerUsage addCustomerUsage() {
        CustomerUsage cu=new CustomerUsage();
        customerUsageHistory.add(cu);
        return cu;
    }
    
}
