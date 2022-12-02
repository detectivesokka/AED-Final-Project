/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;


import userinterface.PharmacistRole.PharmacistWorkAreaJPanel;

/**
 *
 * @author Sai Dutt
 */
public class PharmacistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new PharmacistWorkAreaJPanel(userProcessContainer, userAccount, (PharmacistOrganization) organization, enterprise,dB4OUtil,business);
    }

}
