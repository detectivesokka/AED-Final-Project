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
import userinterface.InsuranceBrokerRole.InsuranceBrokerWorkAreaJPanel;

/**
 *
 * @author Sai Dutt
 */
public class InsuranceBrokerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new InsuranceBrokerWorkAreaJPanel(userProcessContainer, account, (InsBrokerOrganization) organization, enterprise,dB4OUtil,business);
    }

}
