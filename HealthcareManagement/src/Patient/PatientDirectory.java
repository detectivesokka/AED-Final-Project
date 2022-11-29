package Patient;

import Driver.Driver;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public Patient addUser(String name, String password) {        
        
        Patient u = new Patient(name, password);
        patientList.add(u);
        return u;
    }
    
}
