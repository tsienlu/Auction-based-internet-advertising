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
import UserInterface.AdExchangeAdminRole.AdExAdminWorkAreaJPanel;
import UserInterface.SystemAdminRole.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author prat
 */
public class SystemAdminRole extends Role {

    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdExchange adExchange) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business,adExchange);
    }
    
}
