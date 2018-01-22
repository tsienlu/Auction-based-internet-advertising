/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.PublisherProductManagerRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.PublisherProductManagerRole;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class PublisherProductOrganization extends Organization {
    public PublisherProductOrganization() {
        super(Type.PublisherProductOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PublisherProductManagerRole());
        return roles;
    }
}
