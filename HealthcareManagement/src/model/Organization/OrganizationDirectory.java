/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Employee.Employee;
import model.Organization.Organization.Type;
import java.util.ArrayList;
import static model.Organization.Organization.Type.InsFinanceTeam;

/**
 *
 * @author Sai Dutt
 */
public class OrganizationDirectory {

    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return orgList;
    }

    /**
     * Accepts the org type as input and returns new Organization
 object of the same type.
     *
     * @param type
     * @return
     */
    public Organization createOrganization(Type type) {
        Organization org = null;
            
        switch(type.getValue()) {
            
            case "Doctor Organization":
                org = new DoctorOrganization();
                break;
            case "Testing Lab Organization":
                org = new LabOrganization();
                break;
            case "Patient Organization":
                org = new PatientOrganization();
                break;
            case "Accountant Organization":
                org = new AccountantOrganization();
                break;
            case "Medical Auditor Organization":
                org = new NGOAuditorOrganization();
                break;
            case "Treasurer Organization":
                org = new NGOTreasurerOrganization();
                break;
            case "Insurance Broker Organization":
                org = new InsBrokerOrganization();
                break;
            case "Insurance Finance Team Organization":
                org = new InsFinanceTeamOrganization();
                break;
            case "Insurance Architect Organization":
                org = new InsArchitectOrganization();
                break;
            case "Phamacist Organization":
                org = new PharmacistOrganization();
                break;
            case "Delivery Organization":
                org = new DeliveryManOrganization();
                break;            
            default:
                break;
        }        
        
        orgList.add(org);               
        return org;
    }
    
     public Organization searchOrganization(String name) {
        
        for(Organization o : this.orgList){
            
            if(o.getName().equals(name)) {
                
                return o;
            }
        }       
        
        return null;
    }
}
