/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Organization.Organization;
import model.Patient.PatientDirectory;
import model.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sai Dutt
 */
public class HealthCenterEnterprise extends Enterprise {

    private PatientDirectory patDirectory;

    public HealthCenterEnterprise(String name) {
        super(name, EnterpriseType.HealthCenter);
        patDirectory = new PatientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * Returns list of all organizations belonging to HealthCenter Enterprise.
     * @return List of organization types
     */
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Doctor);
        orgTypes.add(Organization.Type.Lab);
        orgTypes.add(Organization.Type.Accountant);

        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public PatientDirectory getPatientDirectory() {
        return patDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patDirectory = patientDirectory;
    }

}
