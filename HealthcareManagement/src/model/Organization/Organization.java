package model.Organization;

/**
 *
 * @author saidutt
 */

import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public abstract class Organization {

    private String organizationName;    
    private int organizationID;
    private static int counter = 0;

    public enum Type {

        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Testing Lab Organization"),
        Patient("Patient Organization"),
        Accountant("Accountant Organization"),
        InsBroker("Insurance Broker Organization"),
        InsArchitect("Insurance Architect Organization"),
        InsFinanceTeam("Insurance Finance Team Organization"),
        NGOTreasurer("Treasurer Organization"),        
        NGOAuditor("Medical Auditor Organization"),
        Pharmacist("Phamacist Organization"),
        DeliveryMan("Delivery Organization");
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        
        this.organizationName = name;
        
        
        organizationID = counter++;        
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    
    public String getName() {
        return organizationName;
    }

    
    public void setName(String name) {
        this.organizationName = name;
    }

   
    @Override
    public String toString() {
        return organizationName;
    }

}
