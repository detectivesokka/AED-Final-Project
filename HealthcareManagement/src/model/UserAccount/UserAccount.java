/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccount;

import model.Employee.Employee;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author Sai Dutt
 */
public class UserAccount {

    private String userName;
    private String password;
    private Employee emp;    
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
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

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
    
    public Employee getEmp() {
        return emp;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return emp.getEmpName();
    }
        
}
