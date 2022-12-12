/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.InsBrokerOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author Sai Dutt
 */
public class InsuranceBrokerRole extends Role {

    /**
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param model
     * @param dB4OUtil
     * @return
     */
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem model,DB4OUtil dB4OUtil) {
        
        return null;        
    }

}
