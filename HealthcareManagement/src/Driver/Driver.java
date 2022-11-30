package Driver;

import Profile.Profile;
import User.User;

/**
 *
 * @author saidutt
 */
public class Driver extends Profile{
            
    public Driver(User user) {
        
        super(user);
        user.setProfile(this);
    }

    @Override
    public String getRole() {
        
        return "Driver";
    }
    
}
