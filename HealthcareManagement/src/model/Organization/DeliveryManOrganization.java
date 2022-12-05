/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Delivery.DeliveryManDirectory;
import model.Role.DeliveryManRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ganesh kukreja
 */
public class DeliveryManOrganization extends Organization{
    
    private DeliveryManDirectory delManDirectory;

    public DeliveryManOrganization() {
        super(Organization.Type.DeliveryMan.getValue());
    }
    
    /**
     * Returns list of all supported role belonging to DeliveryMan Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManRole());
        return roles;
    }
    
}
