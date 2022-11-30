package System;

import Doctor.Doctor;
import Supplier.SupplierDirectory;
import Doctor.DoctorDirectory;
import Driver.DriverDirectory;
import GovernmentEnterprise.GovEnterprise;
import MedicalEnterprise.MedicalEnterprise;
import Nurse.NurseDirectory;
import Patient.Patient;
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
    
    private static HMSystem system;
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
    
    private HMSystem() {
        
        this.governmentEnterprise = new GovEnterprise();
        this.supplierEnterprise = new SupplierEnterprise();
        this.pharmaEnterprise = new PharmaEnterprise();
        this.medicalEnterprise = new MedicalEnterprise();
        
        this.userDirectory = new UserAccountDirectory();    
        
        this.docDirectory = new DoctorDirectory();
        this.nurseDirectory = new NurseDirectory();
        this.driverDirectory = new DriverDirectory();
        this.patientDirectory = new PatientDirectory();        
        
        initData(); // initialize some data
    }
    
    public static HMSystem getInstance() {
        
        if (HMSystem.system == null) {
            
            HMSystem.system = new HMSystem();
        }
        
        return HMSystem.system;
    }

    public static HMSystem getSystem() {
        return system;
    }

    public DoctorDirectory getDocDirectory() {
        return docDirectory;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public DriverDirectory getDriverDirectory() {
        return driverDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }        
    
    public GovEnterprise getGovernmentEnterprise() {       
        return governmentEnterprise;
    }
   
    public SupplierEnterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public PharmaEnterprise getPharmaEnterprise() {
        return pharmaEnterprise;
    }

    public MedicalEnterprise getMedicalEnterprise() {
        return medicalEnterprise;
    }

    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }
    
    public Doctor addDoctor(String username, String password) {
        
        User u = getUserDirectory().addUser(username, password); // Creates new User
        return getDocDirectory().addDoctor(u);     // creates new Doctor   
    }
    
    private void initData() {
        
        User doc = this.userDirectory.addUser("doc", "doc");
        this.docDirectory.addDoctor(doc);
        
        User pat = this.userDirectory.addUser("pat", "pat");
        this.patientDirectory.addPatient(pat);
        
        User driver = this.userDirectory.addUser("driver", "driver");
        this.driverDirectory.addDriver(driver);
        
        User nur = this.userDirectory.addUser("nur", "nur");
        this.nurseDirectory.addNurse(nur);
        
    }
}
