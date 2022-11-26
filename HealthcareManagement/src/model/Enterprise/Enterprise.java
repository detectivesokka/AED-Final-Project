/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import java.util.List;

/**
 *
 * @author Sai Dutt
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory orgDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return orgDirectory;
    }    

    public enum EnterpriseType {

        HealthCenter("HealthCenter"),
        InsuranceCompany("InsuranceCompany"),
        NGO("NGO"),
        Supplier("Supplier");

        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        orgDirectory = new OrganizationDirectory();
    }

    public abstract List<Organization.Type> getAllOrganizationTypes();        
}
