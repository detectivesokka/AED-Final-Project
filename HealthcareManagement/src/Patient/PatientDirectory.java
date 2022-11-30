package Patient;

import User.User;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    {
        patientList = new ArrayList<>();
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient addPatient(User user) {        
        
        if(user == null) {
            
            return null;
        }        
        
        Patient u = new Patient(user);
        patientList.add(u);
        return u;
    }
    
}
