package User;

import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class UserAccountDirectory {
    
    private ArrayList<User> userList;
    int userCounter = 1; // used to set user id

    public ArrayList<User> getUserList() {
        
        return userList;
    }    

    public UserAccountDirectory() {
        
        userList = new ArrayList<>();
    }
    
    public User addUser(String username, String password) {
        
        for (User u : getUserList()) {
            
            if (u.getUserName().equals(username)) { 
                // username already exists
                return null;
            }
        }
        
        User n = new User(username, password, this.userCounter++);
        getUserList().add(n);
        return n;
    }
    
    
}
