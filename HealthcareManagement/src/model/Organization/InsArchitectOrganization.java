/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.InsuranceArchitectRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class InsArchitectOrganization extends Organization {

    public InsArchitectOrganization() {
        super(Organization.Type.InsArchitect.getValue());
    }

    /**
     * Returns list of all supported role belonging to Insurance Architect
     * Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceArchitectRole());
        return roles;
    }

}
