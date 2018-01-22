/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Ecosystem.ProductCatalog;

/**
 *
 * @author varsha
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ProductCatalog productCatalog;
    
    public Enterprise(String name,EnterpriseType type) {
        super(name);
        this.enterpriseType=type;
        this.organizationDirectory=new OrganizationDirectory();
        productCatalog=new ProductCatalog();
    }
    
    public enum EnterpriseType{
        Publisher("Publisher"),
        Advertiser("Advertiser");
        private String value;
        
        private EnterpriseType(String value) {
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    
    
}

