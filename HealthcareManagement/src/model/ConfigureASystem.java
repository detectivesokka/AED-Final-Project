/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Network.HealthcareNetwork;
import model.Role.SystemAdminRole;
import model.UserAccount.UserAccount;


/**
 *
 * @author Sai Dutt
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem ecosystem = EcoSystem.getInstance();
        Employee employee = ecosystem.getEmpDirectory().createEmployee("sysadmin");
        UserAccount userAccount = ecosystem.getUserDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        HealthcareNetwork network; 
        network = ecosystem.createAndAddNetwork();
        network.setNetworkName("System");
        
        network.getEnterpriseDirectory().createEnterprise("Health Center", Enterprise.EnterpriseType.HealthCenter);
        network.getEnterpriseDirectory().createEnterprise("Insurance Company", Enterprise.EnterpriseType.InsuranceCompany);
        network.getEnterpriseDirectory().createEnterprise("NGO", Enterprise.EnterpriseType.NGO);
        network.getEnterpriseDirectory().createEnterprise("Supplier", Enterprise.EnterpriseType.Supplier);                        
        
        return ecosystem;
    }

}
