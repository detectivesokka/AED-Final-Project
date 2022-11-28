package System;

import GovernmentEnterprise.GovEnterprise;
import MedicalEnterprise.MedicalEnterprise;
import PharmaEnterprise.PharmaEnterprise;
import SuppplierEnterprise.SupplierEnterprise;
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
    
    {
        GovEnterprise governemntEnterprise = new GovEnterprise();
        SupplierEnterprise supplierEnterprise = new SupplierEnterprise();
        PharmaEnterprise pharmaEnterprise = new PharmaEnterprise();
        MedicalEnterprise medicalEnterprise = new MedicalEnterprise();
        userDirectory = new UserAccountDirectory();
    }
    
    
}
