/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Finance.getValue())) {
            organization = new FinanceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AdvertiserProductOrganization.getValue())) {
            organization = new AdvertiserProductOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AdvertisingAgencyOrganization.getValue())) {
            organization = new AdvertisingStrategyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.MarketingAgencyOrganization.getValue())) {
            organization = new MarketingStrategyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PublisherProductOrganization.getValue())) {
            organization = new PublisherProductOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
