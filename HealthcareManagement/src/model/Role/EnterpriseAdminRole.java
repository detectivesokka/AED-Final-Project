/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import userinterface.AdministrativeRole.EnterpriseAdminWorkAreaJPanel;
import javax.swing.JPanel;

public class EnterpriseAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem,DB4OUtil dB4OUtil) {
        return new EnterpriseAdminWorkAreaJPanel(userProcessContainer, enterprise, account, ecosystem,dB4OUtil);
    }

}
