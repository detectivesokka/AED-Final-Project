/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.NGOAuditorOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MedicalAuditorRole.AuditorWorkAreaJPanel;

/**
 *
 * @author Sai Dutt
 */
public class NGOHealthAuditorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new AuditorWorkAreaJPanel(userProcessContainer, userAccount, (NGOAuditorOrganization) organization, enterprise, dB4OUtil,business);
    }

}
