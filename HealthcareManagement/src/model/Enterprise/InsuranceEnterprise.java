/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Insurance.InsuranceDirectory;
import model.InsuranceCustomer.InsuranceCustomerDirectory;
import model.Organization.Organization;
import model.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sai Dutt
 */
public class InsuranceEnterprise extends Enterprise {

    private InsuranceCustomerDirectory insCustDirectory;

    private InsuranceDirectory insPolicyDirectory;

    public InsuranceEnterprise(String name) {

        super(name, EnterpriseType.InsuranceCompany);
        insCustDirectory = new InsuranceCustomerDirectory();
        insPolicyDirectory = new InsuranceDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * Returns list of all organizations belonging to Insurance Enterprise.
     *
     * @return List of organization types
     */
    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsBroker);
        orgTypes.add(Organization.Type.InsArchitect);
        orgTypes.add(Organization.Type.InsFinanceTeam);

        return orgTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
        return insCustDirectory;
    }

    public void setInsuranceCustomerDirectory(InsuranceCustomerDirectory insuranceCustomerDirectory) {
        this.insCustDirectory = insuranceCustomerDirectory;
    }

    public InsuranceDirectory getInsurancePolicyDirectory() {
        return insPolicyDirectory;
    }

    public void setInsurancePolicyDirectory(InsuranceDirectory insurancePolicyDirectory) {
        this.insPolicyDirectory = insurancePolicyDirectory;
    }

}
