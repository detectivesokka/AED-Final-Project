package User;

import Profile.Profile;

/**
 *
 * @author saidutt
 */
public class User {
    
    private String userName;
    private String password;    
    private final int id;    
    private Profile profile;    
    
    public User(String userName, String password, int id) {
        
        this.userName = userName;
        this.password = password;        
        this.id = id;
    }    
    
    public int getId() {
        return id;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

    public boolean isPassword(String pwd) {
        
        return pwd.equals(this.password);
    }

    public Profile getProfile() {
        
        return profile;
    }
    
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
