/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacist;

import Pharmacist.Pharmacist;
import User.User;
import java.util.ArrayList;

/**
 *
 * @author ganes
 */
public class PharmacistDirectory {
    
    private ArrayList<Pharmacist> pharmacistList;
    {
        pharmacistList = new ArrayList<>();
    }

    public ArrayList<Pharmacist> getPharmacistList() {
        return pharmacistList;
    }

    public void setPharmacistList(ArrayList<Pharmacist> PharmacistList) {
        this.pharmacistList = PharmacistList;
    }
    
    public Pharmacist addPharmacist(User user){
        
        if(user == null)
        {
            return null;
        }
        
        Pharmacist p = new Pharmacist(user);
        pharmacistList.add(p);
        return p;   
    }
    
    public Pharmacist searchPharmacist(String name){
        
        for(Pharmacist p : pharmacistList){
            
            if(p.getName().equals(name))
                return p;
        }
        
        return null;
    }
    
    public int deletePharmacist(String name) {
        
        Pharmacist p = searchPharmacist(name);
        
        if (p == null)
            return 1;
        
        pharmacistList.remove(p);
        
        return 0;   
    }
            
}
