/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.LabAssistantRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akshi
 */
public class LabOrganization extends Organization {

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    /**
     * Returns list of all supported role belonging to Testing Lab Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }

}
