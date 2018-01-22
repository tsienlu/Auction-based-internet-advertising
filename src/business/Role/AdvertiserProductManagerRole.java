/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Ecosystem.AdExchange;
import Ecosystem.EcoSystem;
import UserInterface.AdvertisingProductManagerRole.AdvertisingProductManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class AdvertiserProductManagerRole extends Role {

    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdExchange adExchange) {
        return new AdvertisingProductManagerWorkArea(userProcessContainer, (AdvertiserEnterprise) enterprise);
    }
    
}
