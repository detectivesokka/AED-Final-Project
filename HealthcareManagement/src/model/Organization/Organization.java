/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Employee.EmployeeDirectory;
import model.Role.Role;
import model.UserAccount.UserAccountDirectory;
import model.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public abstract class Organization {

    private String organizationName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {

        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Testing Lab Organization"),
        Patient("Patient Organization"),
        Accountant("Accountant Organization"),
        InsBroker("Insurance Broker Organization"),
        InsArchitect("Insurance Architect Organization"),
        InsFinanceTeam("Insurance Finance Team Organization"),
        NGOTreasurer("Treasurer Organization"),        
        NGOAuditor("Medical Auditor Organization"),
        Pharmacist("Phamacist Organization"),
        DeliveryMan("Delivery Organization");
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        
        this.organizationName = name;
        
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        
        organizationID = counter++;        
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmpDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.organizationName = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }

}
