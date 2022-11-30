package Doctor;

import Profile.Profile;
import User.User;

/**
 *
 * @author saidutt
 */
public class Doctor extends Profile{       
    
    public Doctor(User user) {
        
        super(user);
        user.setProfile(this); 
    }

    @Override
    public String getRole() {
        
        return "Doctor";
    }
        
}
