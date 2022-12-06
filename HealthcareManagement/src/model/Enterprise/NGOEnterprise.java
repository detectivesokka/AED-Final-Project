/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ganesh Kukreja
 */
public class NGOEnterprise extends Enterprise {

    public NGOEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    /**
     * Returns list of all organizations belonging to NGO Enterprise.
     * @return List of organization types
     */
    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.NGOAuditor);
        orgTypes.add(Organization.Type.NGOTreasurer);

        return orgTypes;
    }

}
