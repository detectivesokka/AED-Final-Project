package System;

import Supplier.SupplierDirectory;
import Doctor.DoctorDirectory;
import Driver.DriverDirectory;
import GovernmentEnterprise.GovEnterprise;
import MedicalEnterprise.MedicalEnterprise;
import Nurse.NurseDirectory;
import Patient.PatientDirectory;
import PharmaEnterprise.PharmaEnterprise;

import SuppplierEnterprise.SupplierEnterprise;
import User.User;
import User.UserAccountDirectory;

/**
 *
 * @author saidutt
 */
public class HMSystem {

    private GovEnterprise governmentEnterprise;
    private SupplierEnterprise supplierEnterprise;
    private PharmaEnterprise pharmaEnterprise;
    private MedicalEnterprise medicalEnterprise;
    
    private UserAccountDirectory userDirectory;
    private DoctorDirectory docDirectory;
    private NurseDirectory nurseDirectory;
    private DriverDirectory driverDirectory;
    private SupplierDirectory supplierDirectory;    
    private PatientDirectory patientDirectory;    
    
    {
        this.governmentEnterprise = new GovEnterprise();
        this.supplierEnterprise = new SupplierEnterprise();
        this.pharmaEnterprise = new PharmaEnterprise();
        this.medicalEnterprise = new MedicalEnterprise();
        this.userDirectory = new UserAccountDirectory();
    }

    public User addUser(String username, String password) {
        
        for (User u : this.userDirectory.getUserList()) {
            
            if (u.getUserName().equals(username)) { 
                // username already exists
                return null;
            }
        }
        
        return this.userDirectory.addUser(username, password);
    }
        
            
    public GovEnterprise getGovernmentEnterprise() {
        
        return governmentEnterprise;
    }

    public void setGovernmentEnterprise(GovEnterprise governmentEnterprise) {
        this.governmentEnterprise = governmentEnterprise;
    }

    public SupplierEnterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(SupplierEnterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }

    public PharmaEnterprise getPharmaEnterprise() {
        return pharmaEnterprise;
    }

    public void setPharmaEnterprise(PharmaEnterprise pharmaEnterprise) {
        this.pharmaEnterprise = pharmaEnterprise;
    }

    public MedicalEnterprise getMedicalEnterprise() {
        return medicalEnterprise;
    }

    public void setMedicalEnterprise(MedicalEnterprise medicalEnterprise) {
        this.medicalEnterprise = medicalEnterprise;
    }

    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }       
    
}
