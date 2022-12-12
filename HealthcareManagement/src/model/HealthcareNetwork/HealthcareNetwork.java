/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.HealthcareNetwork;

import model.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Sai Dutt
 */
public class HealthcareNetwork {

    private String netName;    
    private EnterpriseDirectory enterpriseDirectory;

    public HealthcareNetwork() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getNetworkName() {
        return netName;
    }

    public void setNetworkName(String networkName) {
        this.netName = networkName;
    }
    
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }       
   
    @Override
    public String toString() {
        return netName;
    }    
}
