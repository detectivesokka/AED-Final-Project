/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PharmaEnterprise;

import User.User;
import java.util.ArrayList;

/**
 *
 * @author ganes
 */
public class PharmaEnterprise {
    
    private ArrayList<Pharmacy> pharmacyList;
    {
        pharmacyList = new ArrayList<>();
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<Pharmacy> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }
    
    public Pharmacy addPharmacy(User user){
        
        if(user == null)
        {
            return null;
        }
        
        Pharmacy p = new Pharmacy(user);
        pharmacyList.add(p);
        return p;
    }
    
    public Pharmacy searchPharmacy(String name){
        
        for(Pharmacy p : pharmacyList)
        {
            if(p.getName().equals(p))
                return p;
        }
        return null;
    }
    
    public int deletePharmacy(String name){
        
        Pharmacy p = searchPharmacy(name);
        
        if(p == null)
            return 1;
        
        pharmacyList.remove(p);
        
        return 0;
    }
    
}
