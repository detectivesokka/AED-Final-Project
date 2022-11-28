package User;

import Role.Role;

/**
 *
 * @author saidutt
 */
public class User {

    private String userName;
    private String password;
    private Role userRole;
        
    public User(String userName, String password, Role userRole) {
        
        this.userName = "";
        this.password = "";
        this.userRole = new Role();
    }

    public User(String name, String password, int role) {
        
        setUserName(name);
        setPassword(password);
        setUserRole(role);       
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

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(int role) {
        
        this.userRole.setRole(role);
    }
    
    
    
}
