package User;

import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class UserAccountDirectory {
    
    private ArrayList<User> userList;

    public ArrayList<User> getUserList() {
        
        return userList;
    }    

    public UserAccountDirectory() {
        
        userList = new ArrayList<>();
    }
    
    public User addUser(String name, String password) {
        
        User u = new User(name, password);
        userList.add(u);
        return u;
    }
    
    
}
