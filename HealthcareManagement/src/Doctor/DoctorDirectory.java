package Doctor;

import User.User;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> docList;
    
    {
        docList = new ArrayList<>();
    }    
        
    public ArrayList<Doctor> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doctor> docList) {
        this.docList = docList;
    }   
    
    public Doctor addDoctor(User user) {       
        
        if(user == null) {
            
            return null;
        }
        
        Doctor u = new Doctor(user);        
        docList.add(u);
        return u;
    }
    
    
}
