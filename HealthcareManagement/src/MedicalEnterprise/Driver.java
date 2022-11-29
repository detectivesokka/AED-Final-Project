package MedicalEnterprise;

import Role.Role;
import User.User;

/**
 *
 * @author saidutt
 */
public class Driver extends User{
    
    public Driver(String userName, String password, Role userRole) {
        super(userName, password, userRole);
    }
    
}
