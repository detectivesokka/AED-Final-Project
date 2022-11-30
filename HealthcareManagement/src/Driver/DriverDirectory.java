package Driver;

import User.User;
import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class DriverDirectory {
    
    private ArrayList<Driver> driverList;
    
    {
        driverList = new ArrayList<>();
    }
    
    public Driver addDriver(User user) {        
        
        if(user == null) {
            
            return null;
        }
        
        Driver u = new Driver(user);
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
