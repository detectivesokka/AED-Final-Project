package Patient;

import Profile.Profile;
import User.User;

/**
 *
 * @author saidutt
 */
public class Patient extends Profile{
    
    public Patient(User user) {
        
        super(user);
        user.setProfile(this);
    }

    @Override
    public String getRole() {
        
        return "Patient";
    }
}
