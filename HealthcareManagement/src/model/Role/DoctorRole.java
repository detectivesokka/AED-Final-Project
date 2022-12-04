/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.DB4OUtil.DB4OUtil;
import model.Enterprise.Enterprise;
import model.Organization.DoctorOrganization;
import model.Organization.Organization;

import javax.swing.JPanel;

/**
 *
 * @author Sai Dutt
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new DoctorWorkAreaJPanel(userProcessContainer, (DoctorOrganization) organization, enterprise, business, dB4OUtil);
    }

}
