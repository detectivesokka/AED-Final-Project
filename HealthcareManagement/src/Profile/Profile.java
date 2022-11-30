package Profile;

import User.User;

/**
 *
 * @author saidutt
 */
public abstract class Profile {
    
    User user;
    
    public Profile(User user){
        
        this.user = user;
    }
    
    public abstract String getRole();
    
    public User getUser(){
        
        return user;
    }     

    public boolean isMatch(int id) {
        
        return (user.getId() == id);
    }

}

