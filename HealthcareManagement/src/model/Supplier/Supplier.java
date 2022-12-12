/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;

/**
 *
 * @author Ganesh Kukreja
 */
public class Supplier {
    
    private String name;
    private ArrayList<Medicine> meds;
    
    public Supplier(){
        this.meds=new ArrayList<>();
    }

    public String getPharmaName() {
        return name;
    }

    public void setPharmaName(String pharmaName) {
        this.name = pharmaName;
    }

    public ArrayList<Medicine> getMeds() {
        return meds;
    }

    public void setMeds(ArrayList<Medicine> meds) {
        this.meds = meds;
    }
    
    public Medicine createMedicine(){
        
        Medicine m= new Medicine();
        this.meds.add(m);
        return m;
    }
    
}
