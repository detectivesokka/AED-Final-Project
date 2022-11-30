package Nurse;

import User.User;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class NurseDirectory {
    
    private ArrayList<Nurse> nurseList;
    
    {
        nurseList = new ArrayList<>();
    }
    
    public Nurse addNurse(User user) {       
        
        if(user == null) {
            
            return null;
        }
        
        Nurse u = new Nurse(user);
        nurseList.add(u);
        return u;
    }
    
    public ArrayList<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<Nurse> nurseList) {
        this.nurseList = nurseList;
    }        
}
