package Nurse;

import Driver.Driver;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class NurseDirectory {
    
    private ArrayList<Nurse> nurseList;

    public Nurse addUser(String name, String password) {       
        
        Nurse u = new Nurse(name, password);
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
