/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.InsuranceBrokerRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class InsBrokerOrganization extends Organization {

    public InsBrokerOrganization() {
        super(Organization.Type.InsBroker.getValue());
    }

    /**
     * Returns list of all supported role belonging to Insurance Broker
     * Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceBrokerRole());
        return roles;
    }

}
