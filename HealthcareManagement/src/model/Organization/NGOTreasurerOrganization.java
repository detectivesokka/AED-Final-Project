/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;


import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ganesh Kukreja
 */
public class NGOTreasurerOrganization extends Organization {

    public NGOTreasurerOrganization() {
        super(Organization.Type.NGOTreasurer.getValue());
    }

    /**
     * Returns list of all supported role belonging to NGOTreasurer Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOTreasurer());
        return roles;
    }

}
