/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.MarketingAgencyManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class MarketingStrategyOrganization extends Organization {
    public MarketingStrategyOrganization() {
        super(Type.MarketingAgencyOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MarketingAgencyManagerRole());
        return roles;
    }
}
