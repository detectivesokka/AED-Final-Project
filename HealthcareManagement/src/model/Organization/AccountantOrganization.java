/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.AccountantRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akshi
 */
public class AccountantOrganization extends Organization {

    public AccountantOrganization() {
        super(Organization.Type.Accountant.getValue());

    }

    /**
     * Returns list of all supported role belonging to Accountant Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountantRole());
        return roles;
    }

}
