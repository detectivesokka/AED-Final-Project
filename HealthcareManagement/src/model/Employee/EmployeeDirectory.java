/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Employee;

import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        
        return employeeList;
    }

    /**
     * Accepts employee name and returns new Employee object.
     *
     * @param name
     * @return Employee object
     */
    public Employee createEmployee(String name) {
        
        Employee employee = new Employee();
        employee.setEmpName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee searchEmployee(String name) {
        
        for(Employee e : this.employeeList){
            
            if(e.getEmpName().equals(name)) {
                
                return e;
            }
        }       
        
        return null;
    }
    
    public void deleteEmployee (Employee e) {                                 
        
        if (e != null) {
            
            this.employeeList.remove(e);
        }
    }          
}
