/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Organization.Organization.Type;
import java.util.ArrayList;

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
    
     public Organization searchOrganization(String name) {
        
        for(Organization o : this.orgList){
            
            if(o.getName().equals(name)) {
                
                return o;
            }
        }       
        
        return null;
    }
}
