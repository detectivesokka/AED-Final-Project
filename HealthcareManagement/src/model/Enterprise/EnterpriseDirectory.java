/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }    
    
    public Enterprise searchEnterprise(String name) {
        
        for(Enterprise n : this.enterpriseList) {
            
            if(n.getName().equals(name)) {
                
                return n;
            }
        }
        
        return null;
    }
}
    