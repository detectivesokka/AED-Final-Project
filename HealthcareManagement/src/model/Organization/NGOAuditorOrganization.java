/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.NGOHealthAuditorRole;
import model.Role.LabAssistantRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class NGOAuditorOrganization extends Organization {

    public NGOAuditorOrganization() {
        super(Organization.Type.NGOAuditor.getValue());
    }

    /**
     * Returns list of all supported role belonging to Health Care Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOHealthAuditorRole());
        return roles;
    }

}
