package Patient;

import User.User;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public Patient addUser(User user) {        
        
        Patient u = new Patient(user);
        patientList.add(u);
        return u;
    }
    
}
