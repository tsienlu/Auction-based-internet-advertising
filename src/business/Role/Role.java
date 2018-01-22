/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Ecosystem.AdExchange;
import Ecosystem.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        Admin("Admin"),
        AdExAdmin("AdExAdmin"),
        FinanceManager("FinanceManager"),
        CustomerRole("Customer"),
        AdvertiserProductManagerRole("AdvertiserProductManagerRole"),
        AdvertisingAgencyManagerRole("AdvertisingAgencyManagerRole"),
        MarketingAgencyManagerRole("MarketingAgencyManagerRole"),
        PublisherProductManagerRole("PublisherProductManagerRole");
        ;
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business,AdExchange adExchange);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
