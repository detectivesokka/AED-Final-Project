/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;


import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author Sai Dutt
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new PatientWorkAreaJPanel(userProcessContainer, account, organization, business,dB4OUtil);
    }
}
