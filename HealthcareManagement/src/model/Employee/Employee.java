/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Employee;

/**
 *
 * @author Sai Dutt
 */
public class Employee {

    private String employeeName;
    private int employeeId;
    private static int count = 1;

    public Employee() {
        
        employeeId = count;
        count++;
    }

    public int getEmpId() {
        
        return employeeId;
    }

    public void setEmpName(String empName) {
        
        this.employeeName = empName;
    }

    public String getEmpName() {
        
        return employeeName;
    }

    @Override
    public String toString() {
        
        return employeeName;
    }

}
