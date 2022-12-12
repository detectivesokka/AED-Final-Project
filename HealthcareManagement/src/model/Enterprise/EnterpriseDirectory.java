/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    /**
     * Accepts enterprise name and type and returns new Enterprise object.
     *
     * @param name
     * @param type
     * @return Enterprise object
     */
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type) {
        
        Enterprise enterprise = null;
        
        switch(type) {
            
            case HealthCenter: 
                enterprise = new HealthCenterEnterprise(name);
                break;
            case NGO:
                enterprise = new NGOEnterprise(name);
                break;
            case InsuranceCompany:
                enterprise = new InsuranceEnterprise(name);
                break;
            case Supplier:
                enterprise = new SupplierEnterprise(name);
                break;
        }
        
        enterpriseList.add(enterprise);                
        return enterprise;
    }
    
    public Enterprise searchEnterprise(String name) {
        
        for(Enterprise n : this.enterpriseList) {
            
            if(n.getName().equals(name)) {
                
                return n;
            }
        }
        
        return null;
    }
}
    