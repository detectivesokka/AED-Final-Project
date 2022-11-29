/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccount;

import model.Employee.Employee;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    /**
     * Accepts username, password and returns UserAccount object if user is
     * present in the respective user account directory.
     *
     * @param username
     * @param password
     * @return
     */
    public UserAccount authenticateUser(String username, String password) {
        
        for (UserAccount ua : userAccountList) {
            
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }

        return null;
    }

    /**
     * Accepts username, password, Employee object and role and returns a new
     * UserAccount.
     *
     * @param username
     * @param password
     * @param employee
     * @param role
     * @return
     */
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setEmp(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    /**
     * Accepts username and return true if username is not present in the user
     * directory and false if username is present.
     *
     * @param username
     * @return
     */
    public boolean checkIfUsernameIsUnique(String username) {
        
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    public UserAccount searchUser(String name) {
        
        for(UserAccount e : this.userAccountList){
            
            if(e.getUserName().equals(name)) {
                
                return e;
            }
        }       
        
        return null;
    }
    
    public void deleteUser (String name) { 
        
        UserAccount e;                
        
        e = searchUser(name);
        
        if (e != null) {
                        
            this.userAccountList.remove(e);                        
        }                
    }              
}
