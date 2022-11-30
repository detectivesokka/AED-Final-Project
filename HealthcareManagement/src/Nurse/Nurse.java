package Nurse;

import Profile.Profile;
import User.User;

/**
 *
 * @author saidutt
 */
public class Nurse extends Profile{        
    
    public Nurse(User user) {
        
        super(user);
        user.setProfile(this);
    }
    
    @Override
    public String getRole() {
       
        return "Nurse";
    }        
}
