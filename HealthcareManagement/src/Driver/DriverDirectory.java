package Driver;

import Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class DriverDirectory {
    
    private ArrayList<Driver> driverList;
    
    public Driver addUser(String name, String password) {        
        
        Driver u = new Driver(name, password);
        driverList.add(u);
        return u;
    }

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }
    
}
